package com.nsrpn.spring_boot_study.app.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Genres")
public class Genres extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "parent_id", nullable = true)
    private Genres parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Genres> children;

    @ManyToMany(mappedBy = "genres")
    private List<Book> books;

    public List<Genres> getChildren() {
        return children;
    }

    public void setChildren(List<Genres> children) {
        this.children = children;
    }

    public Genres getParent() {
        return parent;
    }

    public void setParent(Genres parent) {
        this.parent = parent;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
