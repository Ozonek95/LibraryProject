package dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookDto {

    private String title;
    private String authorName;
    private String isbn;
    private String summary;
    private boolean borrowed;


}
