package com.nsrpn.spring_boot_study.app.services;

import com.nsrpn.spring_boot_study.app.entities.Author;
import com.nsrpn.spring_boot_study.app.storage.AuthorStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthorService {
    @Autowired
    private AuthorStorage authorRepo;

    public List<Author> getAll() {
        return authorRepo.findAll();
    }

    public List<Author> getByLetter(String letter) {
        List<Author> all = authorRepo.findAll();
        return all.stream().filter(a -> {
            String[] parts = a.getTitle().split(" ");
            return parts[parts.length - 1].substring(0, 1).equals(letter);
        }).collect(Collectors.toList());
    }

    public Author getById(Long id) {
        return authorRepo.findById(id).get();
    }
}
