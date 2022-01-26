package com.nsrpn.spring_boot_study.app.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "books")
@ApiModel("Books data model")
public class Book extends SluggedEntity {

  @Column(nullable = false)
  @ApiModelProperty("Book's title")
  private String title;

  @Column(nullable = false)
  @ApiModelProperty("Book's publish date")
  private Date pub_date;

  @Column(nullable = false)
  @ApiModelProperty("Is a book bestseller")
  private Boolean is_bestseller;

  @Column
  @ApiModelProperty("Book's image")
  private String image;

  @Column(length = 4000)
  @ApiModelProperty("Book's description")
  private String description;

  @Column(precision = 15, nullable = false)
  @ApiModelProperty("Book's main price")
  private Integer price;

  @Column(name = "priceold", precision = 15)
  @ApiModelProperty("Book's old price")
  private Integer priceOld;

  @Column(precision = 5, nullable = false)
  @ApiModelProperty("Discount")
  private Integer discount;

  @Column
  @ApiModelProperty("Book's rating")
  private Integer stars;

  @ManyToMany
  @JoinTable(
          name = "authors2book",
          joinColumns = @JoinColumn(name = "book_id"),
          inverseJoinColumns = @JoinColumn(name = "author_id"))
  private List<Author> authors;

  @ManyToMany
  @JoinTable(
          name = "tags2book",
          joinColumns = @JoinColumn(name = "book_id"),
          inverseJoinColumns = @JoinColumn(name = "tag_id"))
  private List<Tag> tags;

  @ManyToMany
  @JoinTable(
          name = "genres2book",
          joinColumns = @JoinColumn(name = "book_id"),
          inverseJoinColumns = @JoinColumn(name = "genre_id"))
  private List<Genres> genres;

  public Book() {
    super();
  }

  public List<Author> getAuthors() {
    return authors;
  }

  public void setAuthors(List<Author> authors) {
    this.authors = authors;
  }

  public Integer getPriceOld() {
    return priceOld;
  }

  public void setPriceOld(Integer priceOld) {
    this.priceOld = priceOld;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public String getImage() {
    return image != null ? image : "default_book.png";
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Integer getDiscount() {
    return discount;
  }

  public void setDiscount(Integer discount) {
    this.discount = discount;
  }

  public Date getPub_date() {
    return pub_date;
  }

  public void setPub_date(Date pub_date) {
    this.pub_date = pub_date;
  }

  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public Integer getStars() {
    return stars == null ? 0 : stars;
  }

  public void setStars(Integer stars) {
    this.stars = stars;
  }

  public Boolean getIs_bestseller() {
    return is_bestseller;
  }

  public void setIs_bestseller(Boolean is_bestseller) {
    this.is_bestseller = is_bestseller;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<Genres> getGenres() {
    return genres;
  }

  public void setGenres(List<Genres> genres) {
    this.genres = genres;
  }
}
