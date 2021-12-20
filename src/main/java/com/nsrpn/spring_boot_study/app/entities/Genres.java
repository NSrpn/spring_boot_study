package com.nsrpn.spring_boot_study.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Genres")
@ApiModel("Genres data model")
public class Genres extends BaseEntity{

  @Column(nullable = false)
  @ApiModelProperty("Genre's title")
  private String name;

  @ManyToOne
  @JoinColumn(name = "parent_id", nullable = true)
  @JsonIgnore
  @ApiModelProperty("Genre's parent id, or null if not exists")
  private Genres parent;

  @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
  @ApiModelProperty("Genre's childs")
  private List<Genres> children;

  @ManyToMany(mappedBy = "genres")
  @JsonIgnore
  private List<Book> books;

  @Column(nullable = false)
  @ApiModelProperty("Genre's mnemonic id")
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
