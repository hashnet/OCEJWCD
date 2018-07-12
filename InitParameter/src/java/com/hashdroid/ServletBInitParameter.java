/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashdroid;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author maidul
 */
public class ServletBInitParameter extends HttpServlet {
    private static final String nl = "<br/>";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletBInitParameter</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletBInitParameter at " + request.getContextPath() + "</h1>");
            
            out.println("<p>");
            printServletInitParams(out);
            out.println("</p>");
            
            out.println("<p>");
            printContextInitParams(out);
            out.println("</p>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void printServletInitParams(PrintWriter out) {
        ServletConfig config = getServletConfig();
        out.println("Servlet Name: " + config.getServletName() + nl);
        out.println("Servlet Initialiaation Parameters:" + nl);
        Enumeration<String> params = config.getInitParameterNames();
        while(params.hasMoreElements()) {
            String name = params.nextElement();
            String value = config.getInitParameter(name);
            
            out.println("name:[" + name + "] = value:[" + value + "]" + nl);
        }
    }
    
    private void printContextInitParams(PrintWriter out) {
        ServletConfig config = getServletConfig();
        ServletContext context = config.getServletContext();
        out.println("Context Name: " + context.getServletContextName() + nl);
        out.println("Context Initialiaation Parameters:" + nl);
        Enumeration<String> params = context.getInitParameterNames();
        while(params.hasMoreElements()) {
            String name = params.nextElement();
            String value = context.getInitParameter(name);
            
            out.println("name:[" + name + "] = value:[" + value + "]" + nl);
        }
    }
}
