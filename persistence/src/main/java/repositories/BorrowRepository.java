package repositories;

import model.Borrow;
import model.Borrower;

public class BorrowRepository extends GenericRepository<Borrow,Integer> implements IBorrowRepository{

    @Override
    public void save(Borrow borrow) {
        super.create(borrow);
    }

    @Override
    public void delete(int id) {
        super.deleteById(id);
    }

    @Override
    public void edit(Borrow borrow) {
        super.update(borrow);
    }

    @Override
    public Borrow find(int id) {
        return super.read(id);
    }
}
