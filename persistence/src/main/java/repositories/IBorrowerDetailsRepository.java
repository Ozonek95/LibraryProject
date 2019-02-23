package repositories;

import model.BorrowerDetails;

import java.util.List;

public interface IBorrowerDetailsRepository {
    void save(BorrowerDetails author);
    void delete(int id);
    void edit(BorrowerDetails author);
    BorrowerDetails find(int id);
    List<BorrowerDetails> findAll();
}
