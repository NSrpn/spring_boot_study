package com.nsrpn.spring_boot_study.web.controllers;

import com.nsrpn.spring_boot_study.app.entities.Genres;
import com.nsrpn.spring_boot_study.app.services.GenresService;
import com.nsrpn.spring_boot_study.web.configuration.SpringfoxConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping
@Api(tags = SpringfoxConfig.GENRES_TAG)
public class GenresController {
    private final Logger logger = LoggerFactory.getLogger(AuthorController.class);
    private final GenresService genresService;

    @Autowired
    public GenresController(GenresService genresService) {
        this.genresService = genresService;
    }

    @GetMapping("/genres")
    public String genres(Model model, HttpSession session) {
        return "/genres/index";
    }

    @GetMapping(path = "/genres/slug")
    public String genresSlug(@RequestParam(value = "id") Long id, Model model, HttpSession session) {
        return "/genres/slug";
    }

    @ApiOperation("Get all genres")
    @GetMapping("/api/genres")
    @ResponseBody
    public List<Genres> getGenresApi() {
        return genresService.getAll();
    }

    @ModelAttribute(name = "genresList")
    private List<Genres> prepareCommonModelForIndex(Model model, HttpSession session) {
        return genresService.getTopGenres();
    }
}