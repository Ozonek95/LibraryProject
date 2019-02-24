import dto.BookDto;
import services.BookService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns= "/HomeServlet")
public class HomeServlet extends HttpServlet {
    private final BookService bookService = new BookService();

//    public HomeServlet() {
//        this.bookService = new BookService();
//    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        List<BookDto> bookDtos = bookService.showBooks();
        request.setAttribute("books",bookDtos);

        RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
        dispatcher.forward(request,response);

    }
}
