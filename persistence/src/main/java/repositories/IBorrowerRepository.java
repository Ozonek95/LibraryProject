package repositories;

import model.Borrower;

public interface IBorrowerRepository {
    void save(Borrower author);
    void delete(int id);
    void edit(Borrower author);
    Borrower find(int id);
}
