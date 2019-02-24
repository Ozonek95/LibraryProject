package dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookDto {

    private int id;
    private String title;
    private String authorName;
    private String isbn;
    private String summary;
    private boolean borrowed;

    public BookDto(String title, String authorName, String isbn, String summary, boolean borrowed) {
        this.title = title;
        this.authorName = authorName;
        this.isbn = isbn;
        this.summary = summary;
        this.borrowed = borrowed;
    }
    public BookDto(){}
}
