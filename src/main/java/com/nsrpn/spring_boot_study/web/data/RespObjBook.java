package com.nsrpn.spring_boot_study.web.data;

import com.nsrpn.spring_boot_study.app.entities.Book;

import java.io.Serializable;
import java.util.List;

public class RespObjBook implements Serializable {
  private Long count;
  private List<Book> books;

  public RespObjBook(Long count, List<Book> books) {
    this.count = count;
    this.books = books;
  }

  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }
}
