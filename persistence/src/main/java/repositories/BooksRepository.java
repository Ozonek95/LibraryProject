package repositories;

import hibernate.HibernateConnection;
import model.Book;
import org.hibernate.Session;

import java.util.List;

public class BooksRepository extends GenericRepository<Book,Integer> implements IBooksRepository {

    public List<Book> getAllBooks(){
        return super.findAll();
    }

    @Override
    public void save(Book author) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void edit(Book author) {

    }

    @Override
    public Book find(int id) {
        return null;
    }
}
