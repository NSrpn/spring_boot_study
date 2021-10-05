package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Genres")
public class Genres extends BaseEntity{

  /**
   * наименование жанра
   */
  @Column(nullable = false)
  private String name;

  /**
   * идентификатор родительского жанра или NULL, если жанр является корневым
   */
  @ManyToOne
  @JoinColumn(name = "parent_id", nullable = true)
  private Genres parent;

  /**
   * под-жанры
   */
  @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
  private List<Genres> children;

  /**
   * список книг
   */
  @ManyToMany(mappedBy = "genres")
  private List<Book> books;

  /**
   * мнемонический код жанра, используемый в ссылках на страницу данного жанра
   */
  @Column(nullable = false)
  private String slug;

  public Genres() {
    super();
  }

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public List<Genres> getChildren() {
    return children;
  }

  public void setChildren(List<Genres> children) {
    this.children = children;
  }

  public Genres getParent() {
    return parent;
  }

  public void setParent(Genres parent) {
    this.parent = parent;
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }

  public String getName() {
    return name;
  }

  public void setName(String title) {
    this.name = title;
  }

}
