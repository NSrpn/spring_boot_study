package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Authors")
public class Author extends BaseEntity {

    @Column
    private String imgFileName;

    @Column(length = 32000)
    private String history;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Book> books;

    public Author() {
        super();
    }

    public String getImgFileName() {
        return imgFileName;
    }

    public void setImgFileName(String imgFileName) {
        this.imgFileName = imgFileName;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
