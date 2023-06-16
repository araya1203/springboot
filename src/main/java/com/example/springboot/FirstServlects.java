package com.example.springboot;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/firstServlects")
public class FirstServlects extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("성공");
    }
}