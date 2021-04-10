package com.nsrpn.spring_boot_study.app.services;

import com.nsrpn.spring_boot_study.app.entities.Book;
import com.nsrpn.spring_boot_study.app.storage.BookStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

  @Autowired
  private BookStorage bookRepo;

  public List<Book> getAll() {
    return bookRepo.findAll();
  }

  /*
  public void saveBook(Book book) {
    bookRepo.save(book);
  }

  public boolean removeBookById(Long bookIdToRemove) {
    List<Book> bookIds = ((BookStorage)bookRepo)
                            .getAllBooks()
                            .stream()
                            .filter(b->b.getId().equals(bookIdToRemove))
                            .collect(Collectors.toList());
    bookRepo.remove(bookIds);
    return true;
  }

  public List<Book> getFiltered(String prefix, HttpSession session) {
    Map<String, String> attrs = (Map<String, String>)session.getAttribute("filter");
    return ((BookStorage)bookRepo)
              .getAllBooks()
              .stream()
              .filter(b -> b.matchFilter(prefix, attrs))
              .collect(Collectors.toList());
  }

 */
}
