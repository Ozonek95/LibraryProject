package repositories;

import model.Book;

import java.util.List;

public interface IBooksRepository {
    void save(Book author);
    void delete(int id);
    void edit(Book author);
    Book find(int id);
    List<Book> findAll();
}
