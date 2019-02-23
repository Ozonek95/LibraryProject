package services;

import dto.BookDto;
import model.Book;
import repositories.BooksRepository;

import java.util.ArrayList;
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
        List<BookDto> listToReturn = new ArrayList<>();
        for (Book book:allBooks) {
            BookDto bookDto = new BookDto();
            bookDto.setAuthorName(book.getAuthor().getFirstName()+" "+book.getAuthor().getLastName());
            bookDto.setBorrowed(book.isBorrow());
            bookDto.setIsbn(book.getIsbn());
            bookDto.setSummary(book.getSummary());
            bookDto.setTitle(book.getTitle());
            listToReturn.add(bookDto);
        }
        return listToReturn;
    }
}
