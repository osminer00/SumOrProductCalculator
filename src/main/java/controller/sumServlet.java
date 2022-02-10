package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SimpleCalculator;

/**
 * Servlet implementation class sumServlet
 */
@WebServlet("/sumServlet")
public class sumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sumServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sumNum1 = request.getParameter("sumNum1");
		String sumNum2 = request.getParameter("sumNum2");
		
		SimpleCalculator endSum = new SimpleCalculator(Integer.parseInt(sumNum1), Integer.parseInt(sumNum2));
		endSum.sumCalculator();
		
		request.setAttribute("sumOutput", endSum);
		
		getServletContext().getRequestDispatcher("/sumResult.jsp").forward(request, response);
	}

}
