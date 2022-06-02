
package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeCalculatorServlet extends HttpServlet {

    
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
         return;//Stop the code call! important!
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String yourage = request.getParameter("age");
        int ageafter =0;
        // 
        //validate
        if(yourage == null|| yourage.equals("")){
            
              String message="You must give your current age.";    
              request.setAttribute("message", message);
              
           request.setAttribute("Age", yourage);
           getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
           return;
            }
        else{
            try{
            int agea=Integer.parseInt(yourage);
            ageafter=agea+1;
            String mess="Your age next birthday will be" + " "+ageafter;
           
           // set the rror message
           request.setAttribute("message", mess);
           request.setAttribute("Age", yourage);
         
           getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
           return;
            }
            catch (NumberFormatException e){
                  
                  String mess="You must enter a number.";
           
           // set the rror message
           request.setAttribute("message", mess);
           request.setAttribute("Age", yourage);
         
           getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
           return;
                    }            
            }
        
        
     }

   

}
