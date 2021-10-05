package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "document")
public class Document extends BaseEntity {

  /**
   * порядковый номер документа (для вывода на странице списка документов)
   */
  @Column(columnDefinition = "DEFAULT 0", nullable = false)
  private Integer sort_index;

  /**
   * текст документа в формате HTML
   */
  @Column(length = 4000, nullable = false)
  private String text;

  /**
   * мнемонический код документа, отображаемый в ссылке на страницу документа
   */
  @Column(nullable = false)
  private String slug;

  /**
   * наименование документа
   */
  @Column(nullable = false)
  private String title;

  public Document() {
    super();
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getSort_index() {
    return sort_index;
  }

  public void setSort_index(Integer sort_index) {
    this.sort_index = sort_index;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }
}
