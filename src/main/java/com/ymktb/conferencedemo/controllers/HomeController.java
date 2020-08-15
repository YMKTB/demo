package com.ymktb.conferencedemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class HomeController {

    @GetMapping
    @RequestMapping("/")
    public String home(Map<String, Object> model) {

        return "home";

    }

    @GetMapping
    @RequestMapping("/user")
    public String userMenu(Map<String, Object> model) {

        return "user";

    }

    @GetMapping
    @RequestMapping("/admin")
    public String adminMenu() {

        return "admin";

    }

}
