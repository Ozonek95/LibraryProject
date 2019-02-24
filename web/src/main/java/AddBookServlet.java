import dto.BookDto;
import model.Author;
import model.Book;
import repositories.BooksRepository;
import repositories.IBooksRepository;
import services.BookService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/AddBookServlet")
public class AddBookServlet extends HttpServlet {

    private BookService service = new BookService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String isbn = request.getParameter("isbn");
        String summary = request.getParameter("summary");
        BookDto bookDto = new BookDto(title,author,isbn,summary,false);
        service.addBook(bookDto);
        response.sendRedirect("/HomeServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
