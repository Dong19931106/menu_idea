package com.bjsxt.controller;

import com.bjsxt.pojo.Files;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.FilesService;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @Auther:智恒
 * @Date:2020/2/12
 * @Description:com.bjsxt.controller
 * @version:1.0
 */
@Controller
public class FilesController {
    @Resource
    FilesService filesServiceImpl;
    @RequestMapping("showFiles")
    public String show(HttpServletRequest req){
        List<Files> files = filesServiceImpl.selFiles();
        req.setAttribute("list",files);
        return "main";
    }
    @RequestMapping("downloadpng")
    public void downloadpng(int id, HttpServletRequest req,HttpServletResponse resp,String name) throws IOException {
        resp.setHeader("Content-Disposition","attachment;filename="+name);
        ServletOutputStream os = resp.getOutputStream();
        String path = req.getServletContext().getRealPath("files");
        File file =new File(path,name);
        byte[] bytes = FileUtils.readFileToByteArray(file);
        os.write(bytes);
        os.flush();
        os.close();
        Users user = (Users)req.getSession().getAttribute("user");
        filesServiceImpl.updFiles(id,user,name);
    }
}
