package repositories;

import model.Borrow;

public interface IBorrowRepository {
    void save(Borrow borrow);
    void delete(int id);
    void edit(Borrow borrow);
    Borrow find(int id);
}
