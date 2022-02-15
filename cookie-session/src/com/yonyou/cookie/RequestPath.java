package com.yonyou.cookie;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/requestPath")
public class RequestPath extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String contextPath = req.getContextPath();
        ServletContext servletContext = req.getServletContext();
        String contextPath1 = servletContext.getContextPath();
        String servletContextName = servletContext.getServletContextName();
        System.out.println("contextPath:"+contextPath);
        System.out.println("contextPath1:"+contextPath1);
        System.out.println("servletContextName:"+servletContextName);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
