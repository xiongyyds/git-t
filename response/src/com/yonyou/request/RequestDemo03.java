package com.yonyou.request;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/requestDemo03")
public class RequestDemo03 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取请求正文的字节输入流
        ServletInputStream sis = req.getInputStream();
        System.out.println(sis);
        //2.读取流中的数据
        int len = 0;
        byte[] by = new byte[1024];
        System.out.println(sis.read(by));
        while ((len = sis.read(by)) != -1) {
            System.out.println(new String(by, 0, len)+" --------- ");
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
