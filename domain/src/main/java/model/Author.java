package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    @OneToMany(mappedBy = "author")
    private List<Book> bookList;
    private String firstName;
    private String lastName;
    private String birthPlace;

    public Author(String author) {
        String[] name = author.split(" ");
        this.firstName = name[0];
        if(name.length>1) {
            this.lastName = name[1];
        }
    }

    public Author() {
    }
}
