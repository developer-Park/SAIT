package ca.sait.calculators.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Park
 */

@WebServlet(name = "AgeCalculatorServlet", urlPatterns = {"/age"})
public class AgeCalculatorServlet extends HttpServlet {


 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
    }

   
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
  
        boolean hasData = (
            request.getParameter("age_inpt") != null &&
            request.getParameter("age_inpt").length() > 0
        );    
        
        if (!hasData)  {
            request.setAttribute("message", "You must give your current age");
        }else {
            
            String strAge = request.getParameter("age_inpt");
            System.out.println("Got following input: " + strAge);
       
            boolean invalidData = false;
            
            try{
                Integer.parseInt(strAge);
            }catch(NumberFormatException ex) {
                request.setAttribute("message", "Invalid age provided ");
                invalidData = true;
            }
            
            if (!invalidData) {
                int parsedAge = Integer.parseInt(strAge);

                String newAge = String.valueOf(parsedAge + 1);
                request.setAttribute("message", "Your age next birthday " + newAge);    
            }
            
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);

    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}