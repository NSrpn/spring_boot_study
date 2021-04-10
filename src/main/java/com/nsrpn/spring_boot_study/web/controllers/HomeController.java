package com.nsrpn.spring_boot_study.web.controllers;

import com.nsrpn.spring_boot_study.app.entities.Book;
import com.nsrpn.spring_boot_study.app.services.BookService;
import com.nsrpn.spring_boot_study.app.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value="/")
public class HomeController {

  private final BookService bookService;

  public HomeController(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping
  public String home(Model model, HttpSession session) {
    model.addAttribute("book", new Book());
    List<Book> books = bookService.getAll();
    model.addAttribute("bookList", books);
    return "index";
  }
}