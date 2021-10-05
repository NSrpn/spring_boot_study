package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Map;

@MappedSuperclass
public class BaseEntity implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  public BaseEntity() {
  }

  public BaseEntity(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer(getClass().getName());
    for (Field f : getClass().getDeclaredFields()) {
      sb.append(f.getName() + "=");
      if (f.isAccessible()) {
        try {
          sb.append(f.get(this).toString());
        } catch (IllegalAccessException e) {
          sb.append("error of value getter");
        }
      }
      sb.append("}");
    }
    return sb.toString();
  }
}
