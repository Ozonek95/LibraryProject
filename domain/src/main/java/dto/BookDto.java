package dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDto bookDto = (BookDto) o;
        return borrowed == bookDto.borrowed &&
                title.equals(bookDto.title) &&
                authorName.equals(bookDto.authorName) &&
                isbn.equals(bookDto.isbn) &&
                summary.equals(bookDto.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authorName, isbn, summary, borrowed);
    }

    public boolean isBorrowed() {
        return borrowed;
    }
}
