package com.yonyou.response;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@WebServlet(value = "/responseDemo07")
public class ResponseDemo07 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
         * 文件下载的思路：
         * 1.获取文件路径
         * 2.把文件读到字节输入流中
         * 3.告知浏览器，以下载的方式打开（告知浏览器下载文件的MIME类型）
         * 4.使用响应对象的字节输出流输出到浏览器上
         */
        //1.获取文件路径（绝对路径）
        ServletContext context = this.getServletContext();
        String filePath = context.getRealPath("/uploads/1.png");//通过文件的虚拟路径，获取文件的绝对路径
        //2.通过文件路径构建一个字节输入流
        InputStream in = new FileInputStream(filePath);
        //3.设置响应消息头
        //注意下载的时候，设置响应正文的MIME类型，用application/octet-stream
        resp.setHeader("Content-Type", "application/octet-stream");
        //告知浏览器以下载的方式打开
        resp.setHeader("Content-Disposition", "attachment;filename=1.jpg");
        //4.使用响应对象的字节输出流输出
        OutputStream out = resp.getOutputStream();
        int len = 0;
        byte[] by = new byte[1024];
        while ((len = in.read(by)) != -1) {
            out.write(by, 0, len);
        }
        in.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
