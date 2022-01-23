package com.nsrpn.spring_boot_study.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "authors")
@ApiModel("Authors data model")
public class Author extends SluggedEntity {

  @Column(nullable = false)
  @ApiModelProperty("Author's name")
  private String name;

  @Column
  @ApiModelProperty("Author's photo")
  private String photo;

  @Column(length = 4000)
  @ApiModelProperty("Author's biography")
  private String description;

  @ManyToMany(mappedBy = "authors")
  @JsonIgnore
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

}
