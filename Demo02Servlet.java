package com.qiuyu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//删除注解，使用xml配置文件获取地址映射
public class Demo02Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Session:服务器端，会话级变量
		//他保存在服务器段，是一个变量，java中，可以保存任何变量
		//他是一个会话级变量
		//【服务器会悄悄的吧一个session写入客户端的cookie中，以此对应】
		//他会与客户端浏览器做对应
		//再会话过程中，始终存在
		//客户端无响应：默认30分钟后，服务器自动删除
		//服务器自动删除内容为null的session
	    //客户端断开连接就删除
		
		
		//如果客户端禁止所有cookie，那么session无法写入客户端
		//可以把sessionid写入地址栏中
		
		
		//创建一个session
		//第一步；从请求对象中，获取一个session
		HttpSession session=request.getSession();
		//第二步：调用方法设置
		session.setAttribute("userid", 555);
		
		response.getWriter().println("session设置成功！！");
		
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
