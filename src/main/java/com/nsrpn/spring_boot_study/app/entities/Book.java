package com.nsrpn.spring_boot_study.app.entities;


import javax.persistence.*;

@Entity
@Table(name = "Books")
public class Book extends BaseEntity {

  @Column(name = "priceold", precision = 15, scale = 2)
  private Float priceOld;

  @Column(precision = 15, scale = 2)
  private Float price;

  @Column
  private String imgFileName;

  @ManyToOne
  @JoinColumn(name = "author_id", nullable = false)
  private Author author;

  public Book() {
    super();
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
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

  public String getImgFileName() {
    return imgFileName != null ? imgFileName : "default_book.png";
  }

  public void setImgFileName(String imgFilename) {
    this.imgFileName = imgFilename;
  }

}
