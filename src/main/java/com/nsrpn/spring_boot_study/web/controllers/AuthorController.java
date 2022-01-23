package com.nsrpn.spring_boot_study.web.controllers;

import com.nsrpn.spring_boot_study.app.entities.Author;
import com.nsrpn.spring_boot_study.app.services.AuthorService;
import com.nsrpn.spring_boot_study.web.configuration.SpringfoxConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Controller
@RequestMapping
@Api(tags = SpringfoxConfig.AUTHORS_TAG)
public class AuthorController extends SluggedController<Author> {
    private final String contentPage = "authorDict";
    private final Logger logger = LoggerFactory.getLogger(AuthorController.class);
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public String AuthorsDict(@RequestParam(value = "letter", required = false) String letter, Model model, HttpSession session) {
        prepareCommonModelForIndex(letter, model, session);
        return "/authors/index";
    }
/*
    @GetMapping("/authors/slug")
    public String getAuthor(@RequestParam(value = "id") Long id, Model model, HttpSession session) {
        prepareCommonModelForSlug(id, model, session);
        return "/authors/slug";
    }
*/
    @ApiOperation("Get all authors")
    @GetMapping("/api/authors")
    @ResponseBody
    public List<Author> getAuthorsApi() {
        return authorService.getAll();
    }

    // Это оставлю так, чтобы разделить инфо и список
    private void prepareCommonModelForSlug(Long id, Model model, HttpSession session) {
        model.addAttribute("author", authorService.getById(id));
    }

    private void prepareCommonModelForIndex(String letter, Model model, HttpSession session) {
        List<Author> authors = authorService.getAll();
        Set<String> literas = getLiteras(authors);
        model.addAttribute("authorsList", authorService.getByLetter(letter != null ? letter : (!literas.isEmpty() ? (String) literas.toArray()[0] : null)));
        model.addAttribute("literasList", literas);
    }

    private Set<String> getLiteras(List<Author> authors) {
        return
            authors.stream().map(a -> {
                String[] parts = a.getName().split(" ");
                return parts[parts.length - 1].substring(0, 1);
            }).collect(Collectors.toSet());
    }

    @Override
    public String getModelName() {
        return "author";
    };
}
