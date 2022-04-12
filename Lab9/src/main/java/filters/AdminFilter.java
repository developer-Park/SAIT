package filters;

import ca.sait.securitydemo12.models.User;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lisa Jowett
 */
public class AdminFilter implements Filter 
{    
    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException 
    {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httResponse = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession();

        // create instance of a user
        User user = (User)session.getAttribute("user");
        //storing user in a session can cause issues when a user logs in on a different device. Note to change this later if time permits
        // check if user is an admin or not
        if(user.getRole().getRoleId() == 1)
        {
            chain.doFilter(request, response);
        }
        else
        {
        //if user is not an admin, send to notes
            httResponse.sendRedirect("/notes");
        }
    }
    /**
     * Destroy method for this filter
     */
    public void destroy() 
    {
        
    }

    /**
     * Init method for this filter
     * @param filterConfig
     * @throws javax.servlet.ServletException
     */
    public void init(FilterConfig filterConfig) throws ServletException
    {        
        
    }
}
