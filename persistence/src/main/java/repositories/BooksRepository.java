package repositories;

import hibernate.HibernateConnection;
import model.Book;
import org.hibernate.Session;

import java.util.List;

public class BooksRepository extends GenericRepository<Book,Integer> implements IBooksRepository {

    @Override
    public void save(Book book) {
        super.create(book);
    }

    @Override
    public void delete(int id) {
        super.deleteById(id);
    }

    @Override
    public void edit(Book book) {
        super.update(book);
    }

    @Override
    public Book find(int id) {
        return null;
    }

    @Override
    public List<Book> findAll(){
        return super.findAll();
    }
}
