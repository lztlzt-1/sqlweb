package com.example.demo.Controller;

import com.example.demo.te.User;
//import com.example.demo.te.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControl {
//    private UserService userService;

    @RequestMapping({"/","/index.html"})
    public String index(){
        return "login";
    }

    @RequestMapping("/success")
    public String Success(){
        return "success";
    }
}
