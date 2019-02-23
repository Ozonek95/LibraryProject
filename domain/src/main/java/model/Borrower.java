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
    @OneToOne(cascade = CascadeType.ALL)
    private BorrowerDetails borrowerDetailsId;
}
