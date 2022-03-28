package ca.sait.lab7.servlets;

import ca.sait.lab7.models.Role;
import ca.sait.lab7.models.User;
import ca.sait.lab7.services.UserService;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JeongHun Park
 */
public class UserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserService service = new UserService();
        String action = request.getParameter("action");

        if (action != null && action.equals("delete")) {
            try {
                String email = request.getParameter("email").replaceAll(" ", "+");
                service.delete(email);

                response.sendRedirect("user");
                return;

            } catch (Exception e) {
                Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        try {
            List<User> users = service.getAll();

            request.setAttribute("users", users);
        } catch (Exception ex) {
            Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request, response);
    }

  
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        UserService service = new UserService();

        // Add User 
        if (action != null && action.equals("addUser")) {

            String email = request.getParameter("email");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String password = request.getParameter("password");
            int roleID = Integer.parseInt(request.getParameter("role"));

            Role role = new Role();
            role.setId(roleID);

            try {
                service.insert(email, true, firstName, lastName, password, role);
            } catch (Exception ex) {
            }
        }

        //Edit
        if (action != null && action.equals("editUser")) {

            String email = request.getParameter("editEmail");
            String firstName = request.getParameter("editFirstName");
            String lastName = request.getParameter("editLastName");
            String password = request.getParameter("editPassword");
            int roleID = Integer.parseInt(request.getParameter("editRole"));

            Role role = new Role();
            role.setId(roleID);

            try {
                service.update(email, true, firstName, lastName, password, role);
            } catch (Exception ex) {
            }
        }

        try {
            List<User> users = service.getAll();

            request.setAttribute("users", users);

            this.getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
