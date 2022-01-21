

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
public class ArithmeticCalculatorServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String button = request.getParameter("calc");
		int result;
		int numOne;
		int numTwo;
		String first;
		String second ;

		if(request.getParameter("firstNum").isEmpty() && request.getParameter("secontNum").isEmpty()) {
			request.setAttribute("message", "Result: ---");
		} else
			if(button.contentEquals("plus")) {
				if (request.getParameter("firstNum").isEmpty() || request.getParameter("secontNum").isEmpty()) {
					request.setAttribute("message", "Result: invalid");
				} else {
					try {
						first = request.getParameter("firstNum");
						numOne = Integer.parseInt(first);

						second =  request.getParameter("secontNum");
						numTwo = Integer.parseInt(second);

						result = numOne + numTwo;

						request.setAttribute("message", "Result: " + result);
					} catch (ArithmeticException e) {
						request.setAttribute("message", "Result: invalid");
					}
				}
			}

		if(request.getParameter("firstNum").isEmpty() && request.getParameter("secontNum").isEmpty()) {
			request.setAttribute("message", "Result: ---");
		} else
			if(button.contentEquals("minus")) {
				if (request.getParameter("firstNum").isEmpty() || request.getParameter("secontNum").isEmpty()) {
					request.setAttribute("message", "Result: invalid");
				} else {
					try {
						first = request.getParameter("firstNum");
						numOne = Integer.parseInt(first);

						second =  request.getParameter("secontNum");
						numTwo = Integer.parseInt(second);

						if (numOne < numTwo) {
							result = numTwo - numOne;
							request.setAttribute("message", "Result: " + "-" +  result);
						} else {
							result = numOne - numTwo;
							request.setAttribute("message", "Result: " + result);
						}
					} catch (ArithmeticException e) {
						request.setAttribute("message", "Result: invalid");
					}
				}
			}

		if(request.getParameter("firstNum").isEmpty() && request.getParameter("secontNum").isEmpty()) {
			request.setAttribute("message", "Result: ---");
		} else
			if(button.contentEquals("multi")) {
				if (request.getParameter("firstNum").isEmpty() || request.getParameter("secontNum").isEmpty()) {
					request.setAttribute("message", "Result: invalid");
				} else {
					try {
						first = request.getParameter("firstNum");
						numOne = Integer.parseInt(first);

						second =  request.getParameter("secontNum");
						numTwo = Integer.parseInt(second);

						result = numTwo * numOne;

						request.setAttribute("message", "Result: " + result);
					} catch (ArithmeticException e) {
						request.setAttribute("message", "Result: invalid");
					}
				}
			}

		if(request.getParameter("firstNum").isEmpty() && request.getParameter("secontNum").isEmpty()) {
			request.setAttribute("message", "Result: ---");
		} else
			if(button.contentEquals("modul")) {
				if (request.getParameter("firstNum").isEmpty() || request.getParameter("secontNum").isEmpty()) {
					request.setAttribute("message", "Result: invalid");
				} else {
					try {
						first = request.getParameter("firstNum");
						numOne = Integer.parseInt(first);

						second =  request.getParameter("secontNum");
						numTwo = Integer.parseInt(second);

						result = numOne % numTwo;

						request.setAttribute("message", "Result: " + result);
					} catch (ArithmeticException e) {
						request.setAttribute("message", "Result: invalid");
					}
				}
			}

		getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
	}
}