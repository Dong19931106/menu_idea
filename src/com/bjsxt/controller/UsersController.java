package com.bjsxt.controller;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @Auther:智恒
 * @Date:2020/2/12
 * @Description:com.bjsxt.controller
 * @version:1.0
 */
@Controller
public class UsersController {
    @Resource
    private UsersService usersServiceImpl;
    @RequestMapping("register")
    public String register(Users users, MultipartFile file, HttpServletRequest req) {
        String filename = file.getOriginalFilename();
        String substring = filename.substring(filename.lastIndexOf("."));
        String uuid = UUID.randomUUID().toString();
        String regiName = uuid+substring;
        String images = req.getServletContext().getRealPath("images");
        try {
            FileUtils.copyInputStreamToFile(file.getInputStream(),new File(images+"/"+regiName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        users.setPhoto(regiName);
        int index = usersServiceImpl.insRegister(users);
        req.getSession().setAttribute("user",users);
        if(index>0){
            return "redirect:showFiles";
        }else{
            return "redirect:register";
        }
    }
}
