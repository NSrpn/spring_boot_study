package com.nsrpn.spring_boot_study.web.controllers;

import com.nsrpn.spring_boot_study.app.entities.Book;
import com.nsrpn.spring_boot_study.app.services.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/books")
public class BookController {

  private final String contentPage = "bookDict";
  private Logger logger = LoggerFactory.getLogger(BookController.class);
  private BookService bookService;

  @Autowired
  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping
  public String booksDict(Model model, HttpSession session) {
    model.addAttribute("book", new Book());
    prepareCommonModelForIndex(model, session);
    return "index";
  }

  private void prepareCommonModelForIndex(Model model, HttpSession session) {
    model.addAttribute("content", contentPage);
    List<Book> books = bookService.getAll();
    model.addAttribute("bookList", books);
  }
}
