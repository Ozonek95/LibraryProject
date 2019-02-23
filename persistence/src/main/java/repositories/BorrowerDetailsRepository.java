package repositories;

import model.BorrowerDetails;

import java.util.List;

public class BorrowerDetailsRepository extends GenericRepository<BorrowerDetails,Integer> implements IBorrowerDetailsRepository {


    @Override
    public void save(BorrowerDetails borrowerDetails) {
        super.create(borrowerDetails);
    }

    @Override
    public void delete(int id) {
        super.deleteById(id);
    }

    @Override
    public void edit(BorrowerDetails borrowerDetails) {
        super.update(borrowerDetails);
    }

    @Override
    public BorrowerDetails find(int id) {
        return super.read(id);
    }

    @Override
    public List<BorrowerDetails> findAll(){
        return super.findAll();
    }
}
