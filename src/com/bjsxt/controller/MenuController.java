package com.bjsxt.controller;

import com.bjsxt.pojo.Menu;
import com.bjsxt.service.MenuService;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * @Auther:智恒
 * @Date:2020/2/11
 * @Description:com.bjsxt.controller
 * @version:1.0
 */
@Controller
public class MenuController {
    @Resource
    private MenuService menuServiceImpl;
    @RequestMapping("show")
    @ResponseBody
    public List<Menu> show(){
        return menuServiceImpl.show();
    }
    @RequestMapping(value="download",produces = "text/html;charset=utf-8")
    public void download(String filename, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setHeader("Content-Disposition","attachment;filename=wei.jpg");
        ServletOutputStream os = resp.getOutputStream();
        String path = req.getServletContext().getRealPath("files");
        File file =new File(path,filename);
        byte[] bytes = FileUtils.readFileToByteArray(file);
        os.write(bytes);
        os.flush();
        os.close();
    }
    @RequestMapping("upload")
    public String upload(MultipartFile file,String name) throws IOException {
        System.out.println(name);
        String filename = file.getOriginalFilename();
        String substring = filename.substring(filename.lastIndexOf("."));
        String uuid = UUID.randomUUID().toString();
        FileUtils.copyInputStreamToFile(file.getInputStream(),new File("E:/"+uuid+substring));
        return "index";
    }
}
