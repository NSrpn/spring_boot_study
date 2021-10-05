package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.*;

@Entity
@Table(name = "file_download")
public class FileDownload extends BaseEntity {

  /**
   * идентификатор скачанной книги
   */
  @ManyToOne
  @JoinColumn(name = "book_id", nullable = false)
  private Book book;

  /**
   * идентификатор пользователя, скачавшего книгу
   */
  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  /**
   * количество скачиваний
   */
  @Column(columnDefinition = "DEFAULT 0", nullable = false)
  private Integer count;

  public FileDownload() {
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

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }
}
