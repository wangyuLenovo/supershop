package com.wy.web.controller;

import com.wy.domain.UserT;
import com.wy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;
    @RequestMapping("/get")
    public String getUser(Model model){
        System.out.println("user");
        UserT user = userService.getUser();
        System.out.println(user.getUserName());
        model.addAttribute("user",user);
        return "index";
    }



}




