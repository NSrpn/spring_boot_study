package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "book2user")
public class Book2User extends BaseEntity {

  /**
   * идентификатор книги
   */
  @ManyToOne
  @JoinColumn(name = "book_id", nullable = false)
  private Book book;

  /**
   * идентификатор пользователя
   */
  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  /**
   * тип привязки книги к пользователю
   */
  @ManyToOne
  @JoinColumn(name = "type_id", nullable = false)
  private Book2UserType type;

  /**
   * дата и время возникновения привязки
   */
  @Column(nullable = false)
  private Date time;

  public Book2User() {
    super();
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Book2UserType getType() {
    return type;
  }

  public void setType(Book2UserType type) {
    this.type = type;
  }

  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }
}
