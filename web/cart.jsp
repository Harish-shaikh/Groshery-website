<%-- 
    Document   : cart
    Created on : 30 Nov, 2021, 7:27:04 PM
    Author     : harish shaikh
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="Entity.ragistars"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="helper.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="groshery.css">
        <% ragistars rsss=(ragistars)session.getAttribute("data");%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart</title>
    </head>
    <body style="background-color: lightgrey;">
        <div class="Add-product">
            
            <%
                
            Connection con=ConnectionProvider.getConnection();
            PreparedStatement pst=con.prepareStatement("select * from cart where email=?");
            pst.setString(1,rsss.getName());
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                String n=rs.getString("name");
                  String i=rs.getString("image");
                    String r=rs.getString("rs");
            
            %>
            <div class="carts">
            <div class="added-product">
                <img src="image/<%=i%>">
            </div>
            <div class="cart-pname">
                
                <h1><%=n%></h1>
                 
                
              </div>
                <h1 style="margin-left: 50rem;margin-top: -1rem">&#8377;<%=r%></h1>
            </div>
            <%}%>
        </div>
       
    </body>
</html>
