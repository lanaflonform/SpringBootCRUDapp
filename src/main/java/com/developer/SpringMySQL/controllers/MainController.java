package com.developer.SpringMySQL.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Bala on 6/25/2017.
 */
@Controller
@RequestMapping("/api")
public class MainController {


    @RequestMapping("/login")
    public ModelAndView getLoginPage(){
        ModelAndView mv = new ModelAndView("login");
        //mv.addObject("userlist", userRepo.findAll());
        return mv;
    }

    @RequestMapping("/layout")
    public ModelAndView getLandingPage(){
        ModelAndView mv = new ModelAndView("layout");
        //mv.addObject("userlist", userRepo.findAll());
        return mv;
    }

    @RequestMapping("/home")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("home");
        //mv.addObject("userlist", userRepo.findAll());
        return mv;
    }


}
