package repositories;

import model.Book;

import java.util.List;

public interface IBooksRepository {
    void save(Book book);
    void delete(int id);
    void edit(Book book);
    Book find(int id);
    List<Book> findAll();
}
