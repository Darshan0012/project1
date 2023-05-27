package emp_controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.SendResult;

import emp_dao.Emp_dao;
import emp_dto.Emp_dto;

@WebServlet("/login")
public class Emp_Login extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);

		String email = req.getParameter("email");

		String pwd1 = req.getParameter("pwd");

		Integer fpwd = Integer.parseInt(pwd1);
		Emp_dao dao = new Emp_dao();
		Emp_dto e1 = dao.login(email);

		if (e1 != null) {
			if (e1.getPwd() == fpwd) {
//				resp.getWriter().print("<h1> Welcome to home page </h1>");
				resp.sendRedirect("https://www.facebook.com/login/");
				} else {
				resp.getWriter()
						.print("<h1>enter the proper password </h1>");
				RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
				dispatcher.include(req, resp);
			}
		} else {
			resp.getWriter().print("<h1>accont not found </h1> <a href='signup.html'>click here to  signup</a>");
		}
	}
}
