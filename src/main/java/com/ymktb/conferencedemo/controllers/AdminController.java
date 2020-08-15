package com.ymktb.conferencedemo.controllers;

import com.ymktb.conferencedemo.models.Anno;
import com.ymktb.conferencedemo.models.News;
import com.ymktb.conferencedemo.repositories.AnnoRepository;
import com.ymktb.conferencedemo.repositories.NewsRepository;
import org.hibernate.Session;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AnnoRepository annoRepository;

    @Autowired
    private NewsRepository newsRepository;


    @RequestMapping(value = "/anno", method = RequestMethod.POST)
    public String setAnno(@Valid @ModelAttribute("anno") Anno anno,
                          BindingResult result, Model model) {

        model.addAttribute("icerik", anno.getIcerik());
        model.addAttribute("konu", anno.getKonu());
        model.addAttribute("gecerliliktarihi", anno.getGecerliliktarihi());
        model.addAttribute("photo" , anno.getPhoto());

        annoRepository.saveAndFlush(anno);

        return "newsAdminDelete";
    }

    @RequestMapping(value = "/anno", method = RequestMethod.GET)
    public String getAnno(Model model) {
        model.addAttribute("anno", new Anno());
        model.addAttribute("annoss", annoRepository.findAll());
        return "annoAdmin";
    }

    @RequestMapping(value = "/anno/delete", method = RequestMethod.POST)
    public String deleteAnno(@RequestParam Long id) {
        annoRepository.deleteById(id);
        return "newsAdminDelete";
    }


    @RequestMapping(value = "/anno/update", method = RequestMethod.POST)
    public String updateAnno(@RequestParam final Long id,
                             @RequestParam(required = false) final String konu,
                             @RequestParam(required = false) final String icerik) {
        Anno existingAnno = annoRepository.getOne(id);
        existingAnno.setKonu(konu);
        existingAnno.setIcerik(icerik);
        annoRepository.saveAndFlush(existingAnno);
        return "newsAdminDelete";
    }

    @GetMapping
    @RequestMapping("/news")
    public String getNews(@Valid @ModelAttribute("newsss") News newsss,
                          Model model) {
        model.addAttribute("news", new News());
        model.addAttribute("newsss", newsRepository.findAll());

        return "newsAdmin";
    }

    @RequestMapping(value = "/news", method = RequestMethod.POST)
    public String setNews(@Valid @ModelAttribute("news") News news,
                          Model model) {

        model.addAttribute("icerik", news.getIcerik());
        model.addAttribute("konu", news.getKonu());
        model.addAttribute("gecerliliktarihi", news.getGecerliliktarihi());
        model.addAttribute("haberlinki", news.getHaberlinki());

        newsRepository.saveAndFlush(news);

        return "newsAdminDelete";
    }

    @RequestMapping(value = "/news/delete", method = RequestMethod.POST)
    public String deleteNews(@RequestParam Long id) {
        newsRepository.deleteById(id);
        return "newsAdminDelete";
    }


    @RequestMapping(value = "/news/update", method = RequestMethod.POST)
    public String updateNews(@RequestParam final Long id,
                             @RequestParam(required = false) final String konu,
                             @RequestParam(required = false) final String icerik,
                             @RequestParam(required = false) final String haberLinki) {
        News existingNews = newsRepository.getOne(id);
        existingNews.setKonu(konu);
        existingNews.setIcerik(icerik);
        existingNews.setHaberlinki(haberLinki);
        newsRepository.saveAndFlush(existingNews);
        return "newsAdminDelete";
    }

}
