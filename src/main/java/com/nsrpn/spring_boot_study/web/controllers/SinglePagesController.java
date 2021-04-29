package com.nsrpn.spring_boot_study.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class SinglePagesController {
  @GetMapping(path = "/documents")
  public String documents(Model model, HttpSession session) {
    return "index";
  }
  @GetMapping(path = "/about")
  public String about(Model model, HttpSession session) {
    return "index";
  }
  @GetMapping(path = "/faq")
  public String faq(Model model, HttpSession session) {
    return "index";
  }
  @GetMapping(path = "/contacts")
  public String contacts(Model model, HttpSession session) {
    return "index";
  }

}
