package com.nsrpn.spring_boot_study.app.storage;

import com.nsrpn.spring_boot_study.app.entities.Genres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenresStorage extends JpaRepository<Genres, Long> {
}
