package com.bjsxt.controller;

import com.bjsxt.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Auther:智恒
 * @Date:2020/2/17
 * @Description:com.bjsxt.controller
 * @version:1.0
 */
@Controller
public class PageController {
    @RequestMapping("{page}")
    public String page(@PathVariable String page){
        return page;
    }
    @RequestMapping("login")
    public String login(Users users, HttpSession session){
        if(users.getUsername().equals("韦雪")&&users.getPassword().equals("520")){
            session.setAttribute("users",users);
            return "main1";
        }else{
            return "redirect:/login.jsp";
        }
    }
}
