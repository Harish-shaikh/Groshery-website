/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servalet;

import Entity.ragistars;
import helper.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author harish shaikh
 */
public class carts extends HttpServlet {

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
            out.println("hello");
            HttpSession hs=re.getSession();
           ragistars rsss=(ragistars)hs.getAttribute("data");
          String sg=  rsss.getName();
            out.println(sg);
            String n=re.getParameter("rst");
          
             try{ 
                 Connection con=ConnectionProvider.getConnection();
                 String p="",i="",m="";
         PreparedStatement pst=con.prepareStatement("select * from product where name=?");
        pst.setString(1, n);
        ResultSet rstt=pst.executeQuery();
        while(rstt.next()){
             p=rstt.getString("name");
             i=rstt.getString("image");
             m=rstt.getString("price");
            String d=rstt.getString("detail");
        }
        out.println(p);out.println(i);out.println(m);out.println(sg);
        PreparedStatement pstt=con.prepareStatement("insert into cart(email,name,image,rs) values(?,?,?,?)");
        pstt.setString(1,sg); pstt.setString(2,p);
         pstt.setString(3,i); pstt.setString(4,m);
         
         pstt.executeUpdate();
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
