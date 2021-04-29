package com.nsrpn.spring_boot_study.app.entities;


import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "Books")
public class Book extends BaseEntity {

  @Column(name = "priceold", precision = 15, scale = 2)
  private Float priceOld;

  @Column(precision = 15, scale = 2)
  private Float price;

  @Column
  private String imgFileName;

  @Column(precision = 5, scale = 2)
  private Float sale;

  @Column
  private Date addDate;

  @Column
  private String tags;

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

  public Float getSale() {
    return sale;
  }

  public void setSale(Float sale) {
    this.sale = sale;
  }

  public Date getAddDate() {
    return addDate;
  }

  public void setAddDate(Date addDate) {
    this.addDate = addDate;
  }

  public List<String> getTags() {
    return Arrays.asList(tags.split(","));
  }

  public void setTags(List<String> tagsList) {
    this.tags = String.join(",", tagsList);
  }

}
