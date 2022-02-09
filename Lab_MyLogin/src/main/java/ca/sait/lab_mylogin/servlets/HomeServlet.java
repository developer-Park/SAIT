package ca.sait.lab_mylogin.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author JeongHun Park
 */
public class HomeServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//.  If the user attempts to access /login and the session object username exists, redirect them to /home.  
//If the user attempts to access /home directly and the session object username does not exist, redirect them to /login.       
 HttpSession session = request.getSession();

        String username = (String) session.getAttribute("username");
        if (username == null) {
            response.sendRedirect("login");
            return;
        }
        request.setAttribute("username", username);
        getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        String username = (String) session.getAttribute("username");

        if (username == null) {
            response.sendRedirect("login");
            return;
        }

        request.setAttribute("username", username);

        getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
    }

}
