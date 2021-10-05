package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "faq")
public class FAQ extends BaseEntity {

  /**
   * порядковый номер вопроса в списке вопросов на странице “Помощь”
   */
  @Column(columnDefinition = "DEFAULT 0", nullable = false)
  private Integer sort_index;

  /**
   * вопрос
   */
  @Column(nullable = false)
  private String question;

  /**
   * ответ в формате HTML
   */
  @Column(length = 4000, nullable = false)
  private String answer;

  public FAQ() {
    super();
  }

  public Integer getSort_index() {
    return sort_index;
  }

  public void setSort_index(Integer sort_index) {
    this.sort_index = sort_index;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }
}
