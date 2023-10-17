package linkcode.bank.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import linkcode.bank.model.Registration;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int accNo=Integer.parseInt(request.getParameter("accNo"));
		String custName=request.getParameter("custName");
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		double accBal=Double.parseDouble(request.getParameter("accBal"));
		
		Registration regobj=new Registration(accNo, custName, userName, password, accBal);
		
		PrintWriter out=response.getWriter();
		out.println("<h1>Welcome to the Bank "+custName+"</h1>");
		
		out.println("<table border='2px'>");
		out.println("<tr><td>"+regobj.getAccNo()+"</td><td>"+regobj.getCustName()+"</td><td>"+regobj.getUserName()+"</td><td>"+regobj.getPassword()+"</td><td>"+regobj.getAccBal());
		out.println("/table");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
