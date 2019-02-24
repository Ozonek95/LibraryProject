package services;

import dto.BookDto;
import model.Book;

import java.util.List;

public interface IBookService {
    void addBook(BookDto book);
    void deleteBook(BookDto book);
    void editBook(BookDto book);
    List<BookDto> showBooks();
    BookDto findBook(int bookId);
}
