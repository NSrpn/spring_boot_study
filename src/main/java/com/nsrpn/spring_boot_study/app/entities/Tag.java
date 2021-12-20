package com.nsrpn.spring_boot_study.app.entities;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="Tags")
public class Tag extends BaseEntity {

  @Column(nullable = false)
  private String title;

  @ManyToMany(mappedBy = "tags")
  private List<Book> books;

  public Tag() {
    super();
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
