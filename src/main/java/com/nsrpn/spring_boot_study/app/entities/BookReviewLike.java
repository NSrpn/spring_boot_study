package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "book_review_like")
public class BookReviewLike extends BaseEntity {

  /**
   * идентификатор отзыва
   */
  @ManyToOne
  @JoinColumn(name = "review_id", nullable = false)
  private BookReview review;

  /**
   * идентификатор пользователя, поставившего лайк или дизлайк
   */
  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  /**
   * дата и время, в которое поставлен лайк или дизлайк
   */
  @Column(nullable = false)
  private Date time;

  /**
   * лайк (1) или дизлайк (-1)
   */
  @Column(columnDefinition = "INT CHECK (value IN (-1, 1))", nullable = false)
  private Integer value;

  public BookReviewLike() {
    super();
  }

  public BookReview getReview() {
    return review;
  }

  public void setReview(BookReview review) {
    this.review = review;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }
}
