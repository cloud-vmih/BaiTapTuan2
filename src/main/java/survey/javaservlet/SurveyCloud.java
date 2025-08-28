package survey.javaservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import survey.user.User;

public class SurveyCloud extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";   // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.html";   // the "join" page
        } 
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName  = request.getParameter("lastName");
            String email     = request.getParameter("email");
            String birthday = request.getParameter("Date of Birth");
            String radio = request.getParameter("heardFrom");
            String[] checkbox1 = request.getParameterValues("wantsUpdates");
          
            String[] checkbox2 = request.getParameterValues("emailOK");
           
            String[] contact = request.getParameterValues("contactVia");
           

            // store data in User object 
            User user = new User(firstName, lastName, email, birthday, radio, checkbox1, checkbox2, contact);

            // set User object in request object and set URL
            request.setAttribute("user", user);
            url = "/output.jsp";   // the "thanks" page
        }

        // forward request and response objects to specified URL
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, 
                         HttpServletResponse response) 
                         throws ServletException, IOException {
        doPost(request, response);
    }    
}