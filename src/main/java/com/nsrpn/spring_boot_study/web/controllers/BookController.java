package com.nsrpn.spring_boot_study.web.controllers;

import com.nsrpn.spring_boot_study.app.entities.Book;
import com.nsrpn.spring_boot_study.app.services.AuthorService;
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

  private Logger logger = LoggerFactory.getLogger(BookController.class);
  private BookService bookService;
  private AuthorService authorService;

  @Autowired
  public BookController(BookService bookService, AuthorService authorService) {
    this.bookService = bookService;
    this.authorService = authorService;
  }

  @GetMapping(path = "/author")
  public String booksDict(@RequestParam(value = "id") Long id, Model model, HttpSession session) {
    model.addAttribute("author", authorService.getById(id));
    return "/books/author";
  }

  @GetMapping(path = "/recent")
  public String booksRecent(Model model, HttpSession session) {
    return "/books/recent";
  }

  @GetMapping(path = "/popular")
  public String booksPopular(Model model, HttpSession session) {
    return "/books/popular";
  }

  @GetMapping(path = "/slug")
  public String booksSlug(@RequestParam(value = "id") Long id, Model model, HttpSession session) {
    model.addAttribute("book", bookService.getById(id));
    return "/books/slug";
  }

  @ModelAttribute(name = "book")
  public Book attrBook() {
    return new Book();
  }

  @ModelAttribute(name = "bookList")
  public List<Book> attrBookList() {
    return bookService.getAll();
  }

}
