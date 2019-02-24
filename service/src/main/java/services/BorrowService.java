package services;

import dto.BorrowDto;
import model.Book;
import model.Borrow;
import model.Borrower;
import model.BorrowerDetails;
import repositories.*;

public class BorrowService {
    private final IBorrowerRepository borrowerRepository;
    private final IBorrowRepository borrowRepository;
    private final IBooksRepository booksRepository;

    public BorrowService() {
        this.borrowerRepository = new BorrowerRepository();
        this.borrowRepository = new BorrowRepository();
        this.booksRepository = new BooksRepository();
    }

    public void borrowBook(BorrowDto borrowDto){
        String adress = borrowDto.getCity()+" "+borrowDto.getStreet()+" "+borrowDto.getZip_code();
        Borrower borrower = new Borrower(borrowDto.getBorrowerName()
                , borrowDto.getBorrowerSurname()
                , new BorrowerDetails(adress, borrowDto.getEmail()));

        borrowerRepository.save(borrower);

        Book book = booksRepository.find(borrowDto.getBookId());
        book.setBorrow(true);
        booksRepository.edit(book);

        borrowRepository.save(new Borrow(book,borrower));
    }
}
