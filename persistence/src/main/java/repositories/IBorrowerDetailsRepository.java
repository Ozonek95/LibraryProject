package repositories;

import model.BorrowerDetails;

import java.util.List;

public interface IBorrowerDetailsRepository {
    void save(BorrowerDetails borrowerDetails);
    void delete(int id);
    void edit(BorrowerDetails borrowerDetails);
    BorrowerDetails find(int id);
    List<BorrowerDetails> findAll();
}
