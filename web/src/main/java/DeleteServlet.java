import dto.BookDto;
import repositories.BooksRepository;
import repositories.IBooksRepository;
import services.BookService;
import services.IBookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    private IBooksRepository repository = new BooksRepository();
    private final IBookService service;

    public DeleteServlet() {
        this.service = new BookService();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String bookId = request.getParameter("bookId");
        bookId = bookId.trim();
        BookDto bookDto = service.findBook(Integer.valueOf(bookId));
        if (!bookDto.isBorrowed()) {
            repository.delete(Integer.valueOf(bookId));
        }
        response.sendRedirect("/HomeServlet");

    }
}
