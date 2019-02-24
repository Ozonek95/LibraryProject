package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BorrowDto {
    private String borrowerName;
    private String borrowerSurname;
    private int bookId;
    private String email;
    private String zip_code;
    private String city;
    private String street;


}
