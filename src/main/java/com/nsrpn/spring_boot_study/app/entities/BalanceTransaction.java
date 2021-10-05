package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "balance_transaction")
public class BalanceTransaction extends BaseEntity {

  /**
   * книга, за покупку которой произошло списание, или NULL
   */
  @ManyToOne
  @JoinColumn(name = "book_id")
  private Book book;

  /**
   * идентификатор пользователя
   */
  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  /**
   * дата и время транзакции
   */
  @Column(nullable = false)
  private Date time;

  /**
   * описание транзакции: если зачисление, то откуда, если списание, то на что
   */
  @Column(columnDefinition = "DEFAULT 0", nullable = false)
  private Integer value;

  /**
   * мнемонический идентификатор книги
   */
  @Column(length = 4000, nullable = false)
  private String description;

  public BalanceTransaction() {
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

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
