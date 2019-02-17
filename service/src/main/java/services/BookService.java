package services;

import dto.BookDto;
import model.Book;
import repositories.BooksRepository;

import java.util.List;

public class BookService implements IBookService {
    @Override
    public void addBook(BookDto book) {

    }

    @Override
    public void deleteBook(BookDto book) {

    }

    @Override
    public void editBook(BookDto book) {

    }

    @Override
    public List<BookDto> showBooks() {
        BooksRepository repository = new BooksRepository();
        List<Book> allBooks = repository.getAllBooks();
        return null;
        //TO DO
    }
}
