/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author xfedora
 */
@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String home(Model model){
        //System.out.println("home url.");
        model.addAttribute("name", "vaibhav kalal");
        return "index";
    }
    
    @RequestMapping("/services")
    public ModelAndView services(){
        //System.out.println("service url.");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("contact", "1234567890");
        modelAndView.setViewName("services");
        return modelAndView;
    }
    
    @RequestMapping("/help")
    public ModelAndView help(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("address", "margao, goa");
        modelAndView.setViewName("help");
        return modelAndView;
    }
    
    @RequestMapping("/about")
    public String about(){
        return "about";
    }
}
