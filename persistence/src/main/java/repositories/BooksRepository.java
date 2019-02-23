package repositories;

import hibernate.HibernateConnection;
import model.Book;
import org.hibernate.Session;

import java.util.List;

public class BooksRepository {

    Session session = HibernateConnection.getSession();

    public List<Book> getAllBooks(){
        session.getTransaction().begin();
        List<Book> books = (List<Book>) session.createQuery("from Book").list();
        session.getTransaction().commit();
        return books;
    }
}
