import dto.BookDto;
import services.BookService;
import services.IBookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/GiveBackServlet")
public class GiveBackServlet extends HttpServlet {
    private final IBookService service;

    public GiveBackServlet() {
        this.service = new BookService();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookId = request.getParameter("bookId");
        bookId = bookId.trim();
        BookDto bookDto = service.findBook(Integer.valueOf(bookId));
        bookDto.setBorrowed(false);
        request.setAttribute("book", bookDto);
        response.sendRedirect("/HomeServlet");

    }
}
