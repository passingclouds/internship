package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class MyController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/hello/{id}")
    public String hello(@PathVariable("id") Integer id, Model model){
        List<User> users = userDao.getAllUsers(id);
        model.addAttribute("users", users);
        return "index";
    }

}
