package com.qiuyu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Demo03Servlet
 */
@WebServlet("/demo3")
public class Demo03Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//获取session
		HttpSession session=request.getSession();
		
		Object obj=session.getAttribute("userid");
		
		response.getWriter().println(obj);
		//session.getId()获取session在服务器上对应的地址
		//会写入客户端cookie中，以此对应
		response.getWriter().println(session.getId());
	}


}
