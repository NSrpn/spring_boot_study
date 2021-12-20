package com.nsrpn.spring_boot_study.web.controllers;

import com.nsrpn.spring_boot_study.app.entities.Book;
import com.nsrpn.spring_boot_study.app.services.AuthorService;
import com.nsrpn.spring_boot_study.app.services.BookService;
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
@Api(tags = SpringfoxConfig.BOOKS_TAG)
public class BookController {

  private final Logger logger = LoggerFactory.getLogger(BookController.class);
  private final BookService bookService;
  private final AuthorService authorService;

  @Autowired
  public BookController(BookService bookService, AuthorService authorService) {
    this.bookService = bookService;
    this.authorService = authorService;
  }

  @GetMapping(path = "/books/author")
  public String booksDict(@RequestParam(value = "id") Long id, Model model, HttpSession session) {
    model.addAttribute("author", authorService.getById(id));
    return "/books/author";
  }

  @GetMapping(path = "/books/recent")
  public String booksRecent(Model model, HttpSession session) {
    return "/books/recent";
  }

  @GetMapping(path = "/books/popular")
  public String booksPopular(Model model, HttpSession session) {
    return "/books/popular";
  }

  @GetMapping(path = "/books/slug")
  public String booksSlug(@RequestParam(value = "id") Long id, Model model, HttpSession session) {
    model.addAttribute("book", bookService.getById(id));
    return "/books/slug";
  }

  @ApiOperation("Get all books")
  @GetMapping("/api/books")
  @ResponseBody
  public List<Book> getBooksApi() {
    return bookService.getAll();
  }

  @ModelAttribute(name = "book")
  public Book attrBook() {
    return new Book();
  }

  @ModelAttribute(name = "bookList")
  public List<Book> attrBookList() {
    return bookService.getPaged(0, 20).getContent();
  }

}
