package cn.openlab.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomePageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ServletOutputStream out = resp.getOutputStream();
		out.println("<html><body>");
		out.println("<a href='configure'>Configure</a><br/>");
		out.println("<a href=''>Search</a><br/>");
		out.println("<a href=''>Add</a>");
		out.println("</body></html>");
		out.close();
	}
}
