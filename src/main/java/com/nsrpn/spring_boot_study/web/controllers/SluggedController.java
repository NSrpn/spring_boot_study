package com.nsrpn.spring_boot_study.web.controllers;

import com.nsrpn.spring_boot_study.app.entities.SluggedEntity;
import com.nsrpn.spring_boot_study.app.services.SluggedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping
public abstract class SluggedController<T extends SluggedEntity> {

  @Autowired
  private SluggedService<T> service;

  @GetMapping("/slug")
  public String getSlug(Model model, HttpSession session) {
    prepareCommonModelForSlug(model, session);
    return "/slug";
  }

  // Это оставлю так, чтобы разделить инфо и список
  private void prepareCommonModelForSlug(Model model, HttpSession session) {
    model.addAttribute(getModelName(), service.getBySlug((String) model.getAttribute("slug")));
  }

  public abstract String getModelName();
}
