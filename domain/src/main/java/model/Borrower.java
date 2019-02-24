package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Borrower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int borrowerId;
    private String firstName;
    private String lastName;
    @OneToOne(cascade = CascadeType.PERSIST)
    private BorrowerDetails borrowerDetailsId;

    public Borrower(){}

    public Borrower(String firstName, String lastName, BorrowerDetails borrowerDetailsId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.borrowerDetailsId = borrowerDetailsId;
    }
}
