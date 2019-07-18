package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class MyProfile_Controller {
    @RequestMapping(value="/myprofile", method = RequestMethod.GET)
    public ModelAndView load_myprofile(HttpSession session) {
        ModelAndView mav = new ModelAndView("myprofile");
        String username = session.getAttribute("username").toString();

        mav.addObject("user", username);
        return mav;
    }
}
