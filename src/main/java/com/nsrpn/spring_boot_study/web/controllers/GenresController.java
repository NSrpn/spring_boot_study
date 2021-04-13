package com.nsrpn.spring_boot_study.web.controllers;

import com.nsrpn.spring_boot_study.app.services.GenresService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/genres")
public class GenresController {
    private Logger logger = LoggerFactory.getLogger(AuthorController.class);
    private GenresService genresService;

    @Autowired
    public GenresController(GenresService genresService) {
        this.genresService = genresService;
    }

    @GetMapping
    public String Genres(Model model, HttpSession session) {
        prepareCommonModelForIndex(model, session);
        return "/genres/index";
    }

    private void prepareCommonModelForIndex(Model model, HttpSession session) {
        model.addAttribute("genresList", genresService.getTopGenres());
    }
}