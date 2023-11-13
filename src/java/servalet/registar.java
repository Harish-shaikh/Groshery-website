/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servalet;

import helper.ConnectionProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author harish shaikh
 */
@MultipartConfig
public class registar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest re, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = res.getWriter()) {
           String n=re.getParameter("name");
           String e=re.getParameter("email");
           String d=re.getParameter("dob");
           String m=re.getParameter("mobile");
           String a=re.getParameter("address");
           String p=re.getParameter("password");
           String c=re.getParameter("confirm");
           Part i=re.getPart("image");
       
           try{
               Connection con=ConnectionProvider.getConnection();
               
               PreparedStatement ps=con.prepareStatement("insert into registar(name,email,dob,image,mobile,address,password) values(?,?,?,?,?,?,?)");
              ps.setString(1,n);   ps.setString(2,e);
                 ps.setString(3,d);   ps.setString(4,i.getSubmittedFileName());
                    ps.setString(5,m);   ps.setString(6,a);
                       ps.setString(7,p); 
              ps.executeUpdate();
              
              String rr=re.getRealPath("image")+File.separator+"user"+ File.separator+i.getSubmittedFileName();
              FileOutputStream fos= new FileOutputStream(rr);
              InputStream is=i.getInputStream();
              byte by[]=new byte[is.available()];
              is.read(by);
              fos.write(by);
              fos.close();
              
              
              
           } 
           catch(Exception l){
               
           }
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

}
