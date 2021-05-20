package com.nsrpn.spring_boot_study.web.controllers;

import com.nsrpn.spring_boot_study.app.entities.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpSession;

@Controller
public class SinglePagesController {
  @GetMapping(path = "/documents")
  public String documents(Model model, HttpSession session) {
    return "/documents/index";
  }
  @GetMapping(path = "/about")
  public String about(Model model, HttpSession session) {
    return "about";
  }
  @GetMapping(path = "/faq")
  public String faq(Model model, HttpSession session) {
    return "faq";
  }
  @GetMapping(path = "/contacts")
  public String contacts(Model model, HttpSession session) {
    return "contacts";
  }
  @GetMapping(path = "/signin")
  public String signin(Model model, HttpSession session) {
    return "signin";
  }
  @GetMapping(path = "/signup")
  public String signup(Model model, HttpSession session) {
    return "signup";
  }
  @GetMapping(path = "/cart")
  public String cart(Model model, HttpSession session) {
    return "cart";
  }
  @GetMapping(path = "/postponed")
  public String postponed(Model model, HttpSession session) {
    return "postponed";
  }

  @ModelAttribute(name = "book")
  public Book attrBook() {
    return new Book();
  }
}
