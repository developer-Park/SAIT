package ca.sait.securitydemo12.services;

import ca.sait.securitydemo12.dataaccess.UserDB;
import ca.sait.securitydemo12.models.User;
import java.util.HashMap;

public class AccountService 
{
    UserDB userDB = new UserDB();

    public User login(String email, String password) 
    {    
        try 
        {
            User user = userDB.get(email);
            if (password.equals(user.getPassword())) 
            {
                return user;
            }
        } 
        catch (Exception e) 
        {

        }return null;
    }

    public boolean forgotPassword(String email, String path)
    {
        try 
        {
            User user = userDB.get(email);
            String to = user.getEmail();
            String subject = "Notes App Login";
            String template = path + "/emailtemplates/resetpassword.html";
                
            HashMap<String, String> tags = new HashMap<>();
            tags.put("firstname", user.getFirstName());
            tags.put("lastname", user.getLastName());
            tags.put("email", user.getEmail());
            tags.put("password", user.getPassword());
            tags.put("date", (new java.util.Date()).toString());
                
            GmailService.sendMail(to, subject, template, tags);    
        }
        catch (Exception e) 
        {
            return false;
        }
        return true;
    }
}
