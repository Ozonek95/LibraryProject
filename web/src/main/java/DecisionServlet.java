import actions.Action;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/DecisionServlet")
public class DecisionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Action action = Action.valueOf(request.getParameter("option"));

        switch (action) {
            case DELETE:
                response.sendRedirect("/DeleteServlet?bookId="+request.getParameter("radio"));
                break;
            case UPDATE:
                response.sendRedirect("/UpdateServlet?bookId="+request.getParameter("radio"));
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
