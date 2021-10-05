package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "book_review")
public class BookReview extends BaseEntity {

  /**
   * идентификатор книги
   */
  @ManyToOne
  @JoinColumn(name = "book_id", nullable = false)
  private Book book;

  /**
   * идентификатор пользователя, который написал данный отзыв
   */
  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  /**
   * время, когда оставлен отзыв
   */
  @Column(nullable = false)
  private Date time;

  /**
   * текст отзыва
   */
  @Column(length = 4000, nullable = false)
  private String text;

  public BookReview() {
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

  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
