import dto.BookDto;
import services.BookService;
import services.BorrowService;
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
    private final BorrowService borrowService;

    public GiveBackServlet()
    {
        this.service = new BookService();
        this.borrowService = new BorrowService();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookId = request.getParameter("bookId");
        bookId = bookId.trim();
        BookDto bookDto = service.findBook(Integer.valueOf(bookId));
        if(bookDto.isBorrowed()){
            borrowService.giveBookBack(bookDto);
        }

        response.sendRedirect("/HomeServlet");

    }
}
