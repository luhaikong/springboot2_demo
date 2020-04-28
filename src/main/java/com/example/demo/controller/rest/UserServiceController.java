package com.example.demo.controller.rest;

import com.example.demo.entity.User;
import com.example.demo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class UserServiceController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/listuser",method = RequestMethod.GET)
    private Map<String,Object> listUser(){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        List<User> list = userService.getBaseMapper().selectList(null);
        modelMap.put("userList",list);
        return modelMap;
    }
}
