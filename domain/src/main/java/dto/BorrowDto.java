package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BorrowDto {
    private final String name;
    private final String surname;
    private String borrowerName;
    private String borrowerSurname;
    private int bookId;
    private String email;
    private String zip_code;
    private String city;
    private String street;


    public BorrowDto(String name, String surname, int bookId, String email, String zip_code, String city, String street) {
        this.name = name;
        this.surname = surname;
        this.bookId = bookId;
        this.email = email;
        this.zip_code = zip_code;
        this.city = city;
        this.street = street;
    }
}
