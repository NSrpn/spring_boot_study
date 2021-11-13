package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.*;

@Entity
@Table(name = "book2user_type")
public class Book2UserType extends BaseEntity {

  /**
   * наименование типа привязки
   */
  @Column(columnDefinition = "VARCHAR(20) CHECK (name IN ('Отложена', 'В корзине', 'Куплена', 'В архиве'))", nullable = false)
  private String name;

  /**
   * код типа привязки
   */
  @Column(columnDefinition = "VARCHAR(20) CHECK (code IN ('KEPT', 'CART', 'PAID', 'ARCHIVED'))", nullable = false)
  private String code;

  public Book2UserType() {
    super();
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
