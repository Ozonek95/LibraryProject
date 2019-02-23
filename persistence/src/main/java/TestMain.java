import hibernate.HibernateConnection;
import model.Author;
import model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {
        Session session = HibernateConnection.getSession();
        session.beginTransaction();
        Author author1 = new Author();
        Author author2 = new Author();
        session.save(new Book(true, "Horror", "sadas2", "cos o czyms", "Kurs2", author1));
        session.save(new Book(false, "Horror", "sadas", "cos o czyms", "Kurs", author2));
        session.save(new Book(false, "Horror", "sadas2", "cos o czyms", "Kurs2", author2));

        Book book = session.get(Book.class, 1);
        System.out.println(book.getTitle() + " " + book.getAuthor().toString());

        session.getTransaction().commit();
        session.close();
    }
}
