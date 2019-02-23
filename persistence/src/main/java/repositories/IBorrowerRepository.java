package repositories;

import model.Borrower;

public interface IBorrowerRepository {
    void save(Borrower borrower);
    void delete(int id);
    void edit(Borrower borrower);
    Borrower find(int id);
}
