package com.nsrpn.spring_boot_study.app.services;

import com.nsrpn.spring_boot_study.app.entities.Author;
import com.nsrpn.spring_boot_study.app.entities.Book;
import com.nsrpn.spring_boot_study.app.storage.BookStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

  @Autowired
  private BookStorage bookRepo;

  public List<Book> getAll() {
    return bookRepo.findAll();
  }

  public Book getById(Long id) {
    return bookRepo.findById(id).get();
  }

  public Page<Book> getPaged(int offset, int limit) {
    Pageable page = PageRequest.of(offset, limit);
    return bookRepo.findAll(page);
  }

}
