package com.yonyou.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/responseDemo05")
public class ResponseDemo05 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str = "用户名和密码不匹配，2秒后转向登录页面...";
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.write(str);
        //定时刷新，其实就是设置一个响应消息头
        //Refresh设置的时间单位是秒，如果刷新到其他地址，需要在时间后面拼接上地址
        resp.setHeader("Refresh", "2;URL=/index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
