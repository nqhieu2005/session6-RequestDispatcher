package com.example.requestdispatcher;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        String message = req.getParameter("message");
        req.setAttribute("message", message != null ? message : "Khách");

        resp.setContentType("text/html;charset=UTF-8");
        RequestDispatcher headerDispatcher = req.getRequestDispatcher("/header.jsp");
        RequestDispatcher mainDispatcher = req.getRequestDispatcher("/welcome.jsp");

    }
}
