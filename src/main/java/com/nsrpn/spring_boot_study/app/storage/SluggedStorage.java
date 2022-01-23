package com.nsrpn.spring_boot_study.app.storage;

import com.nsrpn.spring_boot_study.app.entities.SluggedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SluggedStorage<T extends SluggedEntity> extends JpaRepository<T, Long> {

  T findBySlug(String slug);
}
