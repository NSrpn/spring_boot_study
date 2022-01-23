package com.nsrpn.spring_boot_study.app.entities;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class SluggedEntity extends BaseEntity {
  @Column(nullable = false)
  @ApiModelProperty("Mnemonic id page")
  private String slug;

  public SluggedEntity() {
    super();
  }

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }
}
