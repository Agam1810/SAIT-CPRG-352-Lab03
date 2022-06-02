
package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message="Result--";    
              request.setAttribute("message", message);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
         return;//Stop the code call! important!
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        // Start 
        String firstnumber = request.getParameter("first");
        String secondnumber =request.getParameter("second");
        if (firstnumber == null|| firstnumber.equals("")||secondnumber == null|| secondnumber.equals("")) {
             String message="Result: invalid";    
              request.setAttribute("message", message);
              request.setAttribute("Fir", firstnumber);
              request.setAttribute("Sec", secondnumber);
              
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
           return;
            }
        else
        {
            try{
                int firstNumber=Integer.parseInt(firstnumber);
                int secondNumber=Integer.parseInt(secondnumber);
                
                int result=0;
                if(request.getParameter("res").equals("+"))
		{
		result= firstNumber+secondNumber;
		}
                else if(request.getParameter("res").equals("-"))
		{
		 result= firstNumber-secondNumber;	
		}
		else if(request.getParameter("res").equals("*"))
		{
		  result= firstNumber*secondNumber;	
		}
		else if(request.getParameter("res").equals("%"))
		{
		 result= firstNumber%secondNumber;
		}
                
                
                String mess = "Result : " + result;
                request.setAttribute("message",mess);
                request.setAttribute("Fir", firstnumber);
                request.setAttribute("Sec", secondnumber);
               getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
           return;
            }
           catch (NumberFormatException e){
                  
                  String mess="Result: invalid";
           
           // set the rror message
           request.setAttribute("message", mess);
           request.setAttribute("Fir", firstnumber);
           request.setAttribute("Sec", secondnumber);
         
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
           return;
           }  
        }
        
        
        
    }

    
    
}
