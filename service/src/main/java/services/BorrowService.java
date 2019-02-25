package services;

import dto.BookDto;
import dto.BorrowDto;
import model.Book;
import model.Borrow;
import model.Borrower;
import model.BorrowerDetails;
import repositories.*;

import java.util.List;
import java.util.Optional;

public class BorrowService {
    private final IBorrowerRepository borrowerRepository;
    private final IBorrowRepository borrowRepository;
    private final IBooksRepository booksRepository;

    public BorrowService() {
        this.borrowerRepository = new BorrowerRepository();
        this.borrowRepository = new BorrowRepository();
        this.booksRepository = new BooksRepository();
    }

    public void borrowBook(BorrowDto borrowDto) {
        String adress = borrowDto.getCity() + " " + borrowDto.getStreet() + " " + borrowDto.getZip_code();
        Borrower borrower = new Borrower(borrowDto.getBorrowerName()
                , borrowDto.getBorrowerSurname()
                , new BorrowerDetails(adress, borrowDto.getEmail()));

        borrowerRepository.save(borrower);

        Book book = booksRepository.find(borrowDto.getBookId());
        book.setBorrow(true);
        booksRepository.edit(book);

        borrowRepository.save(new Borrow(book, borrower));
    }

    public void giveBookBack(BookDto bookDto) {
        BorrowRepository borrowRepository = new BorrowRepository();

        List<Borrow> all = borrowRepository.findAll();
        //find Borrow object based on bookId
        Optional<Borrow> first = all.stream()
                .filter(b -> b.getBookId().getBookId() == bookDto.getId())
                .findFirst();

        Borrow borrow = first.orElse(null);

        if (borrow != null) {
            borrowRepository.delete(borrow.getBorrowId());
            Book book = booksRepository.find(bookDto.getId());
            book.setBorrow(false);
            booksRepository.save(book);
        }
    }
}
