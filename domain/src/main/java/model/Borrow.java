package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Getter
@Setter
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int borrowId;
    @OneToOne
    private Book bookId;
    @OneToOne
    private Borrower borrowerId;
    private Date rentalDate;

    public Borrow(){
    }

    public Borrow(Book book, Borrower borrower) {
        this.bookId = book;
        this.borrowerId = borrower;
        this.rentalDate = new Date();
    }
}
