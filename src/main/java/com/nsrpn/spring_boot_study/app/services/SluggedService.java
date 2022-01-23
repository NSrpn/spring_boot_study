package com.nsrpn.spring_boot_study.app.services;

import com.nsrpn.spring_boot_study.app.entities.SluggedEntity;
import com.nsrpn.spring_boot_study.app.storage.SluggedStorage;
import org.springframework.stereotype.Service;

@Service
public abstract class SluggedService<T extends SluggedEntity> {

  public abstract SluggedStorage<T> getRepo();

  public T getBySlug(String slug) {
    return getRepo().findBySlug(slug);
  }

}
