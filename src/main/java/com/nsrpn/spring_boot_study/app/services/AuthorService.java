package com.nsrpn.spring_boot_study.app.services;

import com.nsrpn.spring_boot_study.app.entities.Author;
import com.nsrpn.spring_boot_study.app.storage.AuthorStorage;
import com.nsrpn.spring_boot_study.app.storage.SluggedStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthorService extends SluggedService<Author>{
  @Autowired
  private AuthorStorage authorRepo;

  @Override
  public SluggedStorage<Author> getRepo() {
    return authorRepo;
  }

  public List<Author> getAll() {
    return authorRepo.findAll();
  }

  public List<Author> getByLetter(String letter) {
    if (letter == null)
      return Collections.emptyList();
    List<Author> all = authorRepo.findAll();
    return all.stream().filter(a -> {
      String[] parts = a.getName().split(" ");
      return parts[parts.length - 1].substring(0, 1).equals(letter);
    }).collect(Collectors.toList());
  }

  public Author getById(Long id) {
    return authorRepo.findById(id).get();
  }
}
