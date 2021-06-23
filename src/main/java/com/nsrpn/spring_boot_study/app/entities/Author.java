package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "authors")
public class Author extends BaseEntity {

    @Column
    private String photo;

    @Column(length = 4000)
    private String description;

    @Column
    private String slug;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;

    public Author() {
        super();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String imgFileName) {
        this.photo = imgFileName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
