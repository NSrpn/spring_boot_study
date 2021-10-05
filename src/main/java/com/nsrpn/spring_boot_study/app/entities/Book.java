package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "books")
public class Book extends BaseEntity {

  /**
   * название книги
   */
  @Column(nullable = false)
  private String title;

  /**
   * дата публикации
   */
  @Column(nullable = false)
  private Date pub_date;

  /**
   * книга очень популярна, является бестселлером
   */
  @Column(nullable = false)
  private Boolean is_bestseller;

  /**
   * мнемонический идентификатор книги
   */
  @Column(nullable = false)
  private String slug;

  /**
   * изображение обложки
   */
  @Column
  private String image;

  /**
   * описание книги
   */
  @Column(length = 4000)
  private String description;

  /**
   * цена в рублях основная
   */
  @Column(precision = 15, scale = 2, nullable = false)
  private Float price;

  /**
   * цена в рублях старая
   */
  @Column(name = "priceold", precision = 15, scale = 2)
  private Float priceOld;

  /**
   * скидка в процентах или 0, если её нет
   */
  @Column(precision = 5, scale = 2, nullable = false)
  private Float discount;

  /**
   * Количество звезд
   */
  @Column
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
