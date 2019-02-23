package repositories;

import model.Borrow;

import java.util.List;

public interface IBorrowRepository {
    void save(Borrow borrow);
    void delete(int id);
    void edit(Borrow borrow);
    Borrow find(int id);
    List<Borrow> findAll();
}
