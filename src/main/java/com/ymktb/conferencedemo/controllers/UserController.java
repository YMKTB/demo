package com.ymktb.conferencedemo.controllers;

import com.ymktb.conferencedemo.models.Anno;
import com.ymktb.conferencedemo.models.News;
import com.ymktb.conferencedemo.repositories.AnnoRepository;
import com.ymktb.conferencedemo.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private AnnoRepository annoRepository;

    @Autowired
    private NewsRepository newsRepository;

    @GetMapping
    @RequestMapping("/")
    public String gets() {
        return "user";
    }

    @RequestMapping(value = "/anno", method = RequestMethod.GET)
    public String getAnnos(@Valid @ModelAttribute("annos") Anno anno,
                           Model model) {
        model.addAttribute("annos", annoRepository.findAll());
        return "annoUser";
    }

    @RequestMapping(value = "/news", method = RequestMethod.GET)
    public String getNews(@Valid @ModelAttribute("news") News news,
                          Model model) {
        model.addAttribute("news", newsRepository.findAll());
        return "newsUser";
    }

}
