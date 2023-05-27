package emp_controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp_dao.Emp_dao;
import emp_dto.Emp_dto;

@WebServlet("/signup")
public class Emp_Signup extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//	super.doPost(req, resp);

		String email = req.getParameter("email");
		String name = req.getParameter("name");
		String pwd1 = req.getParameter("pwd");

		Integer pwd = Integer.parseInt(pwd1);
		
		Emp_dto dto=new Emp_dto(); 
		dto.setEmail(email);
		dto.setName(name);
		dto.setPwd(pwd);
		
		Emp_dao dao= new  Emp_dao();
		dao.signup(dto);
		
	}
}
