package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Author {
    @Id
    @GeneratedValue
    private int authorId;
    @OneToMany(mappedBy ="author")
    private List<Book> bookList;
    private String firstName;
    private String lastName;
    private String birthPlace;
}
