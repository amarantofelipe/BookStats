package com.felicemarano.bookstats;

import jakarta.persistence.*;

@Entity
@Table(name = "reviews")
public class review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private book book;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public com.felicemarano.bookstats.book getBook() {
        return book;
    }

    public void setBook(com.felicemarano.bookstats.book book) {
        this.book = book;
    }
}
