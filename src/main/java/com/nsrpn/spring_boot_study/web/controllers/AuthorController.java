package com.nsrpn.spring_boot_study.web.controllers;

import com.nsrpn.spring_boot_study.app.entities.Author;
import com.nsrpn.spring_boot_study.app.services.AuthorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Controller
@RequestMapping(value = "/authors")
public class AuthorController {
    private final String contentPage = "authorDict";
    private Logger logger = LoggerFactory.getLogger(AuthorController.class);
    private AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public String AuthorsDict(@RequestParam(value = "letter", required = false) String letter, Model model, HttpSession session) {
        prepareCommonModelForIndex(letter, model, session);
        return "/authors/index";
    }

    @GetMapping(path = "/slug")
    public String getAuthor(@RequestParam(value = "id") Long id, Model model, HttpSession session) {
        prepareCommonModelForSlug(id, model, session);
        return "/authors/slug";
    }

    private void prepareCommonModelForSlug(Long id, Model model, HttpSession session) {
        model.addAttribute("author", authorService.getById(id));
    }

    private void prepareCommonModelForIndex(String letter, Model model, HttpSession session) {
        List<Author> authors = authorService.getAll();
        Set<String> literas = getLiteras(authors);
        model.addAttribute("authorsList", authorService.getByLetter(letter != null ? letter : (String) literas.toArray()[0]));
        model.addAttribute("literasList", literas);
    }

    private Set<String> getLiteras(List<Author> authors) {
        return
            authors.stream().map(a -> {
                String[] parts = a.getTitle().split(" ");
                return parts[parts.length - 1].substring(0, 1);
            }).collect(Collectors.toSet());
    }
}
