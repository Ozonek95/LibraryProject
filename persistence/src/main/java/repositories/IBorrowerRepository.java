package repositories;

import model.Borrower;

import java.util.List;

public interface IBorrowerRepository {
    void save(Borrower borrower);
    void delete(int id);
    void edit(Borrower borrower);
    Borrower find(int id);
    List<Borrower> findAll();
}
