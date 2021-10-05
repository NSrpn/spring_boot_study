package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

  /**
   * имя пользователя
   */
  @Column
  private String name;

  /**
   * хэш пользователя, используемый для внешней идентификации пользователя с целью скрытия его ID
   */
  @Column(nullable = false)
  private String hash;

  /**
   * дата и время регистрации
   */
  @Column(nullable = false)
  private Date regTime;

  /**
   *  баланс личного счёта, по умолчанию 0
   */
  @Column(nullable = false)
  private Integer balance;

  /**
   *  список отзывов
   */
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
  private Set<BookReview> bookReview;

  /**
   *  список книг
   */
  @ManyToMany(mappedBy = "book")
  private List<Book2User> books;

  public User() {
    super();
  }

  public List<Book2User> getBooks() {
    return books;
  }

  public void setBooks(List<Book2User> books) {
    this.books = books;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public Date getRegTime() {
    return regTime;
  }

  public void setRegTime(Date regTime) {
    this.regTime = regTime;
  }

  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public Set<BookReview> getBookReview() {
    return bookReview;
  }

  public void setBookReview(Set<BookReview> bookReview) {
    this.bookReview = bookReview;
  }
}
