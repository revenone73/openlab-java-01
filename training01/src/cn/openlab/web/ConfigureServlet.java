package cn.openlab.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.openlab.test.UserDaoManager;

public class ConfigureServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ServletOutputStream out = resp.getOutputStream();
		out.println("<html><body><form action='configure' method='post'>");
		out.println("<input type='radio' name='implType' value='cn.openlab.test.UserDAOMemoryImpl'/>");
		out.println("Memory Implementation <br/>");
		out.println("<input type='radio' name='implType' value='cn.openlab.test.UserDAOJDBCImpl'/>");
		out.println("JDBC Implementation <br/>");
		out.println("<input type='radio' name='implType' value='cn.openlab.test.UserDAOHibernateImpl'/>");
		out.println("Hibernate Implementation <br/>");
		out.println("<input type='submit' value='Save'/>");
		out.println("</form>");
		out.println("</body></html>");
		out.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String impl = req.getParameter("implType");
		UserDaoManager.TYPE = impl;
		resp.sendRedirect("homepage");
	}
}
