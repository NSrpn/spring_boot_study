package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "book_file_type")
public class BookFileType extends BaseEntity {

  /**
   * расширение файлов
   */
  @Column(columnDefinition = "VARCHAR(255) CHECK (value IN ('PDF', 'EPUB', 'FB2'))")
  private String name;

  /**
   * описание типов файлов
   */
  @Column(length = 4000)
  private String description;

  public BookFileType() {
    super();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
