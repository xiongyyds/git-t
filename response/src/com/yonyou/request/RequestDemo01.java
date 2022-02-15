package com.yonyou.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/requestDemo01")
public class RequestDemo01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //本机地址：服务器地址
        String localAddr = req.getLocalAddr();
        //本机名称：服务器名称
        String localName = req.getLocalName();
        //本机端口：服务器端口
        int localPort = req.getLocalPort();
        //来访者ip
        String remoteAddr = req.getRemoteAddr();
        //来访者主机
        String remoteHost = req.getRemoteHost();
        //来访者端口
        int remotePort = req.getRemotePort();
        //统一资源标识符
        String URI = req.getRequestURI();
        //统一资源定位符
        String URL = req.getRequestURL().toString();
        //获取查询字符串
        String queryString = req.getQueryString();
        //获取Servlet映射路径
        String servletPath = req.getServletPath();

        //输出内容
        System.out.println("getLocalAddr() is :"+localAddr);
        System.out.println("getLocalName() is :"+localName);
        System.out.println("getLocalPort() is :"+localPort);
        System.out.println("getRemoteAddr() is :"+remoteAddr);
        System.out.println("getRemoteHost() is :"+remoteHost);
        System.out.println("getRemotePort() is :"+remotePort);
        System.out.println("getRequestURI() is :"+URI);
        System.out.println("getRequestURL() is :"+URL);
        System.out.println("getQueryString() is :"+queryString);
        System.out.println("getServletPath() is :"+servletPath);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
