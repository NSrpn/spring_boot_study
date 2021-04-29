package com.nsrpn.spring_boot_study.web.controllers;

import com.nsrpn.spring_boot_study.app.entities.Book;
import com.nsrpn.spring_boot_study.app.entities.Tag;
import com.nsrpn.spring_boot_study.app.services.BookService;
import com.nsrpn.spring_boot_study.app.services.TagService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping(value="/")
public class HomeController {

  private final BookService bookService;
  private final TagService tagService;

  public HomeController(BookService bookService, TagService tagService) {
    this.bookService = bookService;
    this.tagService = tagService;
  }

  @GetMapping
  public String home(Model model, HttpSession session) {
    return "index";
  }

  @ModelAttribute(name = "book")
  public Book attrBook() {
    return new Book();
  }

  @ModelAttribute(name = "bookList")
  public List<Book> attrBookList() {
    return bookService.getAll();
  }

  @ModelAttribute(name = "recentList")
  public List<Book>  attrRecentList() {
    return attrBookList().stream().
            filter(b -> (LocalDate.now().until(b.getAddDate().toLocalDate(), ChronoUnit.DAYS) < 6)).
            collect(Collectors.toList());
  }

  @ModelAttribute(name = "tagList")
  public List<Tag> attrTagList() {
    return tagService.getAll();
  }

}