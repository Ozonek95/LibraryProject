package services;

import model.Book;

public interface IBookService {
    void addBook(Book book);
    void deleteBook(Book book);
    void editBook(Book book);
    void showBooks();
}
