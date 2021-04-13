package com.nsrpn.spring_boot_study.app.storage;

import com.nsrpn.spring_boot_study.app.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorStorage extends JpaRepository<Author, Long> {
}
