package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "user_contact")
public class UserContact extends BaseEntity {

  /**
   * идентификатор пользователя, к которому относится данный контакт
   */
  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  /**
   * тип контакта (телефон или e-mail)
   */
  @Column(columnDefinition = "VARCHAR(10) CHECK (value IN ('PHONE', 'EMAIL'))")
  private String type;

  /**
   * подтверждён ли контакт (0 или 1)
   */
  @Column(nullable = false)
  private Boolean approved;

  /**
   * код подтверждения
   */
  @Column
  private String code;

  /**
   * количество попыток ввода кода подтверждения
   */
  @Column
  private int codeTrials;

  /**
   * дата и время формирования кода подтверждения
   */
  @Column
  private Date codeTime;

  /**
   * контакт (e-mail или телефон)
   */
  @Column(nullable = false)
  private String contact;

  public UserContact() {
    super();
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Boolean getApproved() {
    return approved;
  }

  public void setApproved(Boolean approved) {
    this.approved = approved;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public int getCodeTrials() {
    return codeTrials;
  }

  public void setCodeTrials(int codeTrials) {
    this.codeTrials = codeTrials;
  }

  public Date getCodeTime() {
    return codeTime;
  }

  public void setCodeTime(Date codeTime) {
    this.codeTime = codeTime;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }
}
