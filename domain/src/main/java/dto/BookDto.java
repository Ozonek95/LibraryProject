package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDto {

    private String title;
    private String authorName;
    private String isbn;
    private String summary;
    private boolean borrowed;
}
