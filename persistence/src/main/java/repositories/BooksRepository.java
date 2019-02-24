package repositories;


import model.Book;

import org.hibernate.Transaction;

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
       return super.read(id);
    }

    @Override
    public List<Book> findAll(){
            return session.createNativeQuery("Select * from book",Book.class).list();
    }
}
