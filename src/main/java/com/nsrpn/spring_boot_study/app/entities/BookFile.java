package com.nsrpn.spring_boot_study.app.entities;


import javax.persistence.*;

@Entity
@Table(name = "book_file")
public class BookFile extends BaseEntity {

  /**
   * случайный хэш, предназначенный для идентификации файла при скачивании
   */
  @Column(nullable = false)
  private String hash;

  /**
   * тип файла
   */
  @ManyToOne
  @JoinColumn(name = "type_id", nullable = false)
  private BookFileType type;

  /**
   * путь к файлу
   */
  @Column(nullable = false)
  private String path;

  public BookFile() {
    super();
  }

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public BookFileType getType() {
    return type;
  }

  public void setType(BookFileType type) {
    this.type = type;
  }
}
