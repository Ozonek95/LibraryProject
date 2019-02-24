package repositories;

import model.Borrower;

import java.util.List;

public class BorrowerRepository extends GenericRepository<Borrower,Integer> implements IBorrowerRepository{

    @Override
    public void save(Borrower borrower) {
         super.create(borrower);
    }

    @Override
    public void delete(int id) {
        super.deleteById(id);
    }

    @Override
    public void edit(Borrower borrower) {
        super.update(borrower);
    }

    @Override
    public Borrower find(int id) {
        return super.read(id);
    }

    @Override
    public List<Borrower> findAll() {
        return super.findAll();
    }
}
