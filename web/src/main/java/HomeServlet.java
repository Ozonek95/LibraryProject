import hibernate.HibernateConnection;
import model.Author;
import model.Book;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns= "/HomeServlet")
public class HomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Session currentSession = HibernateConnection.getSession();
        currentSession.beginTransaction();
        currentSession.save(new Book(false,"SO","dawfaw12",
                "Summary","title", new Author()));
        currentSession.save(new Book(false,"SO","dawfaw11",
                "Summary","title", new Author()));
        currentSession.getTransaction().commit();

        response.sendRedirect("home.jsp");

    }
}
