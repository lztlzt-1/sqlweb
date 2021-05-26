package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    @PostMapping("/user/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Map<String,Object> map, HttpSession session
            ){
        if(!StringUtils.isEmpty(username) &&"123456".equals(password)) {
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }
        else{
            session.setAttribute("msg","cuowu");
            return "redirect:/logins";
        }
    }
}
