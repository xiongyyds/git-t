package com.yonyou.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(value = "/requestDemo02")
public class RequestDemo02 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.根据名称获取头的值	一个消息头一个值
        String value = req.getHeader("Accept-Encoding");
        System.out.println("getHeader():" + value);

        //2.根据名称获取头的值	一个头多个值
        Enumeration<String> values = req.getHeaders("Accept");
        while (values.hasMoreElements()) {
            System.out.println("getHeaders():" + values.nextElement());
        }

        //3.获取请求消息头的名称的枚举
        Enumeration<String> names = req.getHeaderNames();
        while (names.hasMoreElements()) {
            String name = names.nextElement();
            String value1 = req.getHeader(name);
            System.out.println(name + ":" + value1);
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
