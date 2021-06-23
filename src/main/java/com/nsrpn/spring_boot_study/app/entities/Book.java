package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "books")
public class Book extends BaseEntity {

  @Column(name = "priceold", precision = 15, scale = 2)
  private Float priceOld;

  @Column(precision = 15, scale = 2)
  private Float price;

  @Column
  private String image;

  @Column(precision = 5, scale = 2)
  private Float discount;

  @Column
  private Date pub_date;

  @Column
  private Integer stars;

  @Column
  private Boolean is_bestseller;

  @Column
  private String slug;

  @Column(length = 4000)
  private String description;

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
  private List<Tag> genres;

  public Book() {
    super();
  }

  public List<Author> getAuthors() {
    return authors;
  }

  public void setAuthors(List<Author> authors) {
    this.authors = authors;
  }

  public Float getPriceOld() {
    return priceOld;
  }

  public void setPriceOld(Float priceOld) {
    this.priceOld = priceOld;
  }

  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public String getImage() {
    return image != null ? image : "default_book.png";
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Float getDiscount() {
    return discount;
  }

  public void setDiscount(Float discount) {
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

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
