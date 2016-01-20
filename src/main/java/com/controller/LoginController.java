package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenjunjun on 16/1/18 10:25
 */

@Controller
public class LoginController {


    @RequestMapping("login1.do")
    public String login1(Model model){
        return "login1";
    }
    @RequestMapping("login2.do")
    public String login2(Model model){
        return "login2";
    }
    @RequestMapping("login3.do")
    public String login3(Model model){
        return "login3";
    }
    @RequestMapping("login4.do")
    public String login4(Model model){
        return "login4";
    }
    @RequestMapping("login5.do")
    public String login5(Model model){
        return "login5";
    }

}
