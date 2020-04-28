package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/superadmin")
public class WebController {


    @RequestMapping(value = "/myindex", method = RequestMethod.GET)
    public String index() {
        return "myindex";
    }

}
