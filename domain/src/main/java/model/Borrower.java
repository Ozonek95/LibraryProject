package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Borrower {
    @Id
    @GeneratedValue
    private int borrowerId;
    private String firstname;
    private String lastname;
    @OneToOne(cascade = CascadeType.ALL)
    private BorrowerDetails borrowerDetailsId;
}
