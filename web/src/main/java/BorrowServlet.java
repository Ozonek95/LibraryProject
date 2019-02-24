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

@WebServlet(urlPatterns = "/BorrowServlet")
public class BorrowServlet extends HttpServlet {
    private final IBookService service;

    public BorrowServlet() {
        this.service = new BookService();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookId = request.getParameter("bookId");
        bookId=bookId.trim();
        BookDto bookDto = service.findBook(Integer.valueOf(bookId));
        request.setAttribute("book",bookDto);
        request.getRequestDispatcher("borrow.jsp").forward(request,response);
    }
}
