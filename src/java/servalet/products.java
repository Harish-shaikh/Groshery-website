/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servalet;

import Entity.Addproduct;
import helper.ConnectionProvider;
import static helper.ConnectionProvider.con;
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
public class products extends HttpServlet {

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
       String c=re.getParameter("category");
       String d=re.getParameter("detail");
       String p=re.getParameter("price");
       Part i=re.getPart("image");
       
        
        try{
           Addproduct ap=new Addproduct(n,c,d,p,i.getSubmittedFileName()); 
          Connection con=ConnectionProvider.getConnection();
           PreparedStatement ps=con.prepareStatement("insert into product(name,category,detail,price,image) Values(?,?,?,?,?)");
           ps.setString(1,ap.getName()); ps.setString(2,ap.getCategory());
            ps.setString(3,ap.getDetail()); ps.setString(4,ap.getPrice());
             ps.setString(5,ap.getImage());
             
             ps.executeUpdate();
             
              String im=re.getRealPath("image")+File.separator + i.getSubmittedFileName();
              FileOutputStream fos=new FileOutputStream(im);
              InputStream is=i.getInputStream();
              byte by[]=new byte[is.available()];
              is.read(by);
              fos.write(by);
              fos.close();
        }
        catch(Exception l){
            l.printStackTrace();
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
