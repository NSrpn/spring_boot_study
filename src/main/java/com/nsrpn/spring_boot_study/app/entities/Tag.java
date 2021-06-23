package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="Tags")
public class Tag extends BaseEntity {

  @ManyToMany(mappedBy = "tags")
  private List<Book> books;

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }
}
