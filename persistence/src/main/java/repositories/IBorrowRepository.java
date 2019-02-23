package repositories;

import model.Borrow;

public interface IBorrowRepository {
    void save(Borrow author);
    void delete(int id);
    void edit(Borrow author);
    Borrow find(int id);
}
