package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;
@Entity
@Getter
@Setter
public class Borrow {
    @Id
    @GeneratedValue
    private int borrowId;
    @OneToOne
    private Book bookId;
    @OneToOne
    private Borrower borrowerId;
    private Date rentalDate;
}