package org.vineet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloServlet extends HttpServlet
{
//    public void service(HttpServletRequest request, HttpServletResponse response)
//    {
//        System.out.println("In Service");
//    }
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.getWriter().println("Hello from Embedded Tomcat!");
}

}
