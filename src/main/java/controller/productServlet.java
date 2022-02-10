package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SimpleCalculator;

/**
 * Servlet implementation class productServlet
 */
@WebServlet("/productServlet")
public class productServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prodNum1 = request.getParameter("prodNum1");
		String prodNum2 = request.getParameter("prodNum2");
		
		SimpleCalculator endProd = new SimpleCalculator(Integer.parseInt(prodNum1), Integer.parseInt(prodNum2));
		endProd.productCalculator();
		
		request.setAttribute("prodOutput", endProd);
		
		getServletContext().getRequestDispatcher("/productResult.jsp").forward(request, response);
	}

}
