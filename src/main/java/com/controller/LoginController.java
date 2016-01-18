package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenjunjun on 16/1/18 10:25
 */

@Controller
public class LoginController {


    @RequestMapping("login.do")
    public String login(Model model){
        return "login";
    }

}
