package com.yonyou.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * cookie的默认绑定路径
 */
@WebServlet(value = "/user/createCookie")
public class CreateCookie extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //默认绑定的path是当前资源的路径 http://localhost:8080/user
        Cookie cookie = new Cookie("name","lisi");
        resp.addCookie(cookie);
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter print = resp.getWriter();
        print.print("cookie生成！！！");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
