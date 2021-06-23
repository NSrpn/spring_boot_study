package com.nsrpn.spring_boot_study.app.entities;

import liquibase.pro.packaged.S;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
  @Column
  private String hash;

  @Column
  private Date regTime;

  @Column
  private Integer balance;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
  private Set<BookReview> bookReview;

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
