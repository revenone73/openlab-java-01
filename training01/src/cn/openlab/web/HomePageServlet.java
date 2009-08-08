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
		out.println("<img width='100' height='100' src='http://www.36588.com.cn/imagelib/6/46/image/%E8%88%92%E6%B7%87%E5%86%99%E7%9C%9F%E5%9B%BE%E7%89%8711.jpg'/>");
		out.println("<br/>");
		out.println("<a href='configure'>Configure</a><br/>");
		out.println("<a href=''>Search</a><br/>");
		out.println("<a href=''>Add</a>");
		
		out.println("<table border='1'>");
		for(int i = 0; i < 10; i++){
			out.println("<tr>");
			for(int j = 0; j < 3; j++) {
				out.println("<td>");
				out.println(i + " " + j);
				out.println("</td>");
			}
			out.println("</tr>");
		}
		out.println("</table>");

		out.println("</body></html>");
		out.close();
	}
}
