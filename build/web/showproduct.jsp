<%-- 
    Document   : showproduct
    Created on : 24 Nov, 2021, 7:18:35 PM
    Author     : harish shaikh
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="helper.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="groshery.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show product</title>
    </head>
    <body style="background-color: lightgray;">
        
        
        <% 
            Connection con=ConnectionProvider.getConnection();
            String h=request.getParameter("data");
            PreparedStatement pst=con.prepareStatement("select * from product where name=?");
        pst.setString(1, h);
        ResultSet rst=pst.executeQuery();
        while(rst.next()){
           
            String i=rst.getString("image");
            String m=rst.getString("price");
            String d=rst.getString("detail");
            
        
      %>
        <div class="showproduct">
            
      <div class="imgs1">
          <img src="image/<%=i%>" style="width: 30rem; height: 30rem;">
     
          <div class="buttons-but">
              
              <a href="carts?rst=<%=h%>">Add cart</a>
              <a href="#" style="background-color: red;">Buy now</a>
          </div>
      </div>
        
        <div class="show">
            <h1><%=h%></h1>
            <span style="font-size:2.5rem; font-weight: 600;">&#8377;<%=m%></span><br>
            <span><%=d%></span><br>
        </div>
        
        </div>
        <%}%>
        <div class="offers">
            
            <span style="font-size: 1.5rem;font-weight: 600;">Available offers</span><br><br>
           
                <span> Bank Offer5%</span> Instant Discount on HDFC Bank Cards and EMI Transactions <a href="#">T&C</a><br>

            <span>Bank Offer5%</span> Unlimited Cashback on Flipkart Axis Bank Credit Card<a href="#">T&C</a><br>

            <span> Bank Offer20%</span> off on 1st txn with Amex Network Cards issued by ICICI Bank,
            <br>IndusInd Bank,SBI Cards and Mobikwik<a href="#">T&C</a><br>
                
            <span>   Bank Offer15%</span> Instant discount on first Pay Later order of ₹500 and above<a href="#">T&C</a>
        </div>
        <div class="feedback">
            <span>
                Feedback&Review:-
            </span>
        </div>
    </body>
</html>
