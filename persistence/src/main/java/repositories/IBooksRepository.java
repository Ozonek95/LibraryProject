package repositories;

import model.Book;

public interface IBooksRepository {
    void save(Book author);
    void delete(int id);
    void edit(Book author);
    Book find(int id);
}
