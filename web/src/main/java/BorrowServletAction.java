import dto.BookDto;
import dto.BorrowDto;
import services.BookService;
import services.BorrowService;
import services.IBookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/BorrowServletAction")
public class BorrowServletAction extends HttpServlet {
    private BorrowService borrowService = new BorrowService();
    private IBookService service = new BookService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String zip_code = request.getParameter("zip_code");
        String city = request.getParameter("city");
        String street = request.getParameter("street");
        String email = request.getParameter("email");
        int bookId = Integer.valueOf(request.getParameter("bookId"));
        BookDto bookDto = service.findBook(Integer.valueOf(bookId));

        if (bookDto.isBorrowed()) {
            BorrowDto borrowDto = new BorrowDto(name, surname, bookId, email, zip_code, city, street);
            borrowService.borrowBook(borrowDto);
            response.sendRedirect("/HomeServlet");
        }
        request.getRequestDispatcher("/HomeServlet").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookId = request.getParameter("bookId");
        bookId = bookId.trim();
        BookDto bookDto = service.findBook(Integer.valueOf(bookId));
        if (bookDto.isBorrowed()) {
            borrowService.giveBookBack(bookDto);
        }

        response.sendRedirect("/HomeServlet");
    }
}
