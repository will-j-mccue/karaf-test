package com.mycompany.app;

import org.osgi.service.component.annotations.Component;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component(
        property = { "alias=/servlet-example", "servlet-name=Example"}
)
public class ExampleServlet extends HttpServlet implements Servlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try (PrintWriter writer = response.getWriter()) {
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<title>Example</title>");
            writer.println("</head>");
            writer.println("<body align='center'>");
            writer.println("<h1>Example Servlet</h1>");
            writer.println("</body>");
            writer.println("</html>");
        }
    }
}