package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private boolean borrow;
    private String category;
    private String isbn;
    private String summary;
    private String title;
    @ManyToOne(cascade = CascadeType.ALL)
    private Author author;

    public Book(boolean borrow, String category, String isbn, String summary, String title, Author author) {
        this.borrow = borrow;
        this.category = category;
        this.isbn = isbn;
        this.summary = summary;
        this.title = title;
        this.author = author;
    }

    public Book() {
    }
}
