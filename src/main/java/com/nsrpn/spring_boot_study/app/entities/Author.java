package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "authors")
public class Author extends BaseEntity {
  /**
   * имя и фамилия автора
   */
  @Column(nullable = false)
  private String name;

  /**
   * изображение с фотографией автора
   */
  @Column
  private String photo;

  /**
   * мнемонический идентификатор автора, который будет отображаться в ссылке на его страницу
   */
  @Column(nullable = false)
  private String slug;

  /**
   * описание (биография, характеристика)
   */
  @Column(length = 4000)
  private String description;

  @ManyToMany(mappedBy = "authors")
  private Set<Book> books;

  public Author() {
    super();
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String imgFileName) {
    this.photo = imgFileName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Set<Book> getBooks() {
    return books;
  }

  public void setBooks(Set<Book> books) {
    this.books = books;
  }

  public String getName() {
    return name;
  }

  public void setName(String title) {
    this.name = title;
  }

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }
}
