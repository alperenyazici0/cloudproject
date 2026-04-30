package com.swe304.cloudproject.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "publishes")
public class Publish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    private LocalDate publishDate;
    private Integer edition;

    //yorum
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Author getAuthor() { return author; }
    public void setAuthor(Author author) { this.author = author; }

    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }

    public LocalDate getPublishDate() { return publishDate; }
    public void setPublishDate(LocalDate publishDate) { this.publishDate = publishDate; }

    public Integer getEdition() { return edition; }
    public void setEdition(Integer edition) { this.edition = edition; }
}