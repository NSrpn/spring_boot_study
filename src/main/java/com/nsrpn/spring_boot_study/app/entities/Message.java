package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "message")
public class Message extends BaseEntity {

  /**
   * дата и время отправки сообщения
   */
  @Column(nullable = false)
  private Date time;

  /**
   * если пользователь был авторизован
   */
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  /**
   * электронная почта пользователя, если он не был авторизован
   */
  @Column
  private String email;

  /**
   * имя пользователя, если он не был авторизован
   */
  @Column
  private String name;

  /**
   * тема сообщения
   */
  @Column(nullable = false)
  private String subject;

  /**
   * текст сообщения
   */
  @Column(length = 4000, nullable = false)
  private String text;

  public Message() {
    super();
  }

  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
