package com.nsrpn.spring_boot_study.app.services;

import com.nsrpn.spring_boot_study.app.entities.Tag;
import com.nsrpn.spring_boot_study.app.storage.TagStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {
  @Autowired
  private TagStorage tagsRepo;

  public List<Tag> getAll() {
      return tagsRepo.findAll();
    }
}
