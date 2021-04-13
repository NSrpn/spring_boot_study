package com.nsrpn.spring_boot_study.app.services;

import com.nsrpn.spring_boot_study.app.entities.BaseEntity;
import com.nsrpn.spring_boot_study.app.entities.Genres;
import com.nsrpn.spring_boot_study.app.storage.GenresStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GenresService {
    @Autowired
    private GenresStorage genresRepo;

    public List<Genres> getAll() {
        return genresRepo.findAll();
    }

    public List<Genres> getTopGenres() {
        return getAll().stream()
                .filter(g -> !g.getChildren().isEmpty())
                .sorted(Comparator.comparing(BaseEntity::getTitle))
                .collect(Collectors.toCollection(LinkedList::new));
    }

}
