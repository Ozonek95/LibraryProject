package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BorrowerDto {
    private int borrowerId;
    private String firstName;
    private String lastName;
    private int borrowerDetailsId;

    public BorrowerDto(int borrowerId, String firstName, String lastName, int borrowerDetailsId) {
        this.borrowerId = borrowerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.borrowerDetailsId = borrowerDetailsId;
    }
}
