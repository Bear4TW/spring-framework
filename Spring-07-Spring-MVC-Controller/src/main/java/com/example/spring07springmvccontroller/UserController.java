package com.example.spring07springmvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user")
    public String userinfo(){
        return "user/userinfo.html";
    }
}
