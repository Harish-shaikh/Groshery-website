<%-- 
    Document   : index
    Created on : 14 Nov, 2021, 7:12:59 PM
    Author     : harish shaikh
--%>


<%@page import="Entity.ragistars"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="helper.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <% ragistars rsss=(ragistars)session.getAttribute("data");%>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="groshery.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>groshery</title>
    </head>
    <body>
        <div class="navbar">
            <div class="nav">
                <h1><marquee>Groshery</marquee></h1>
                <input type="text" placeholder="search">
                <button class="fa fa-search"></button>
            </div>
            
            <div class="nav-list">
               <div class="img-data">
                <%if(rsss!=null){%>
                <div class="name">
                    <li> <%=rsss.getName()%></li> 
                </div>

                <li><a href="logout">Logout</a></li>
                
                <div class="imgs">
                     
                <li><img src="image/user/<%=rsss.getImage()%>" style=" display: flex;margin-top: -1.8rem;"></li>
                
                </div>
              
                <%} else{%>
                
                <li><a href="login.jsp">Login</a></li>
                <%}%>
               </div>
                 <li><a href="#">Contact Us</a></li>
                <li><a href="cart.jsp" class="fa fa-shopping-cart"></a></li>
                <li><a href="#">Home</a></li>
            </div>
            
                
            </div>
               <div class="title">
                   <span style="margin-top: 12rem;display: flex;">Welcome to <br>Groshery</span>
                   
            </div>
        <div class="nav-img">
            <img src="image/shopping2_1.jpg">
            
            </div>
        <div class="vegitable">
        <h1>Vegitable</h1>
        </div>
         
        <div class="img-con">
            <% 
                Connection con=ConnectionProvider.getConnection();
                PreparedStatement ps=con.prepareStatement("select * from product where category=?");
                ps.setString(1, "vegitable");
               ResultSet rs=ps.executeQuery();
               while(rs.next()){
                   String n=rs.getString("name");
                   String c=rs.getString("category");
                   String d=rs.getString("detail");
                   String p=rs.getString("price");
                   String i=rs.getString("image");
               
            %>
            
            <div class="img-con1">
                
                     <div><img style="width: 20rem;height: 20rem;" src="image/<%=i%>"></div>
                     
                     <div class="bookname"><span ><%=n%></span></div>
                     <div><span style="margin-left: 1rem;margin-top: 1rem;font-size: 2rem; font-weight: 1.5rem;">&#8377;<%=p%></span></div>
                     <div class="buy-button"><a href="showproduct.jsp?data=<%=n%>">Buy</a></div>
                    <div><span style="text-align: center;font-size: 1rem; font-weight: 1.5rem;"><%=c%></span></div>
                      <div><span style="text-align: center;font-size: 1rem; font-weight: 1.5rem;"><%=d%></span></div>
                   
            </div>
            <%}%>
        </div>
        <div class="vegitable">
        <h1>Fruit</h1>
        </div>
         
        <div class="img-con">
            <% 
                Connection conn=ConnectionProvider.getConnection();
                PreparedStatement psa=conn.prepareStatement("select * from product where category=?");
                psa.setString(1, "fruit");
               ResultSet rst=psa.executeQuery();
               while(rst.next()){
                   String n=rst.getString("name");
                   String ca=rst.getString("category");
                   String da=rst.getString("detail");
                   String pa=rst.getString("price");
                   String ia=rst.getString("image");
               
            %>
            
            <div class="img-con1">
                
                     <div> <img style="width: 20rem;height: 20rem;" src="image/<%=ia%>"></div>
                     
                     <div class="bookname"><span ><%=n%></span></div>
                     <div><span style="margin-left: 1rem;margin-top: 1rem;font-size: 2rem; font-weight: 1.5rem;">&#8377;<%=pa%></span></div>
                    <div class="buy-button"><a href="showproduct.jsp?data=<%=n%>">Buy</a></div>
                    <div><span style="text-align: center;font-size: 1rem; font-weight: 1.5rem;"><%=ca%></span></div>
                      <div><span style="text-align: center;font-size: 1rem; font-weight: 1.5rem;"><%=da%></span></div>
                   
            </div>
            <%}%>
        </div>
      <div class="vegitable">
        <h1>DryFruit</h1>
        </div>
         
        <div class="img-con">
            <% 
                Connection conn1=ConnectionProvider.getConnection();
                PreparedStatement psa1=conn1.prepareStatement("select * from product where category=?");
                psa1.setString(1, "dryfruit");
               ResultSet rst3=psa1.executeQuery();
               while(rst3.next()){
                   String n=rst3.getString("name");
                   String ca=rst3.getString("category");
                   String da=rst3.getString("detail");
                   String pa=rst3.getString("price");
                   String ia=rst3.getString("image");
               
            %>
            
            <div class="img-con1">
                
                     <div> <img style="width: 20rem;height: 20rem;" src="image/<%=ia%>"></div>
                     
                     <div class="bookname"><span ><%=n%></span></div>
                     <div><span style="margin-left: 1rem;margin-top: 1rem;font-size: 2rem; font-weight: 1.5rem;">&#8377;<%=pa%></span></div>
                    <div class="buy-button"><a href="showproduct.jsp?data=<%=n%>">Buy</a></div>
                    <div><span style="text-align: center;font-size: 1rem; font-weight: 1.5rem;"><%=ca%></span></div>
                      <div><span style="text-align: center;font-size: 1rem; font-weight: 1.5rem;"><%=da%></span></div>
                   
            </div>
            <%}%>
        </div>
        <div class="vegitable">
        <h1>Eggs&Meat</h1>
        </div>
         
        <div class="img-con">
            <% 
                Connection conn2=ConnectionProvider.getConnection();
                PreparedStatement psa2=conn2.prepareStatement("select * from product where category=?");
                psa2.setString(1, "eggs&meat");
               ResultSet rst2=psa2.executeQuery();
               while(rst2.next()){
                   String n=rst2.getString("name");
                   String ca=rst2.getString("category");
                   String da=rst2.getString("detail");
                   String pa=rst2.getString("price");
                   String ia=rst2.getString("image");
               
            %>
            
            <div class="img-con1">
                
                     <div> <img style="width: 20rem;height: 20rem;" src="image/<%=ia%>"></div>
                     
                     <div class="bookname"><span ><%=n%></span></div>
                     <div><span style="margin-left: 1rem;margin-top: 1rem;font-size: 2rem; font-weight: 1.5rem;">&#8377;<%=pa%></span></div>
                    <div class="buy-button"><a href="showproduct.jsp?data=<%=n%>">Buy</a></div>
                    <div><span style="text-align: center;font-size: 1rem; font-weight: 1.5rem;"><%=ca%></span></div>
                      <div><span style="text-align: center;font-size: 1rem; font-weight: 1.5rem;"><%=da%></span></div>
                   
            </div>
            <%}%>
        </div>
        <div class="vegitable">
        <h1>Grains</h1>
        </div>
         
        <div class="img-con">
            <% 
                Connection conn3=ConnectionProvider.getConnection();
                PreparedStatement psa3=conn3.prepareStatement("select * from product where category=?");
                psa3.setString(1, "grains");
               ResultSet rst4=psa3.executeQuery();
               while(rst4.next()){
                   String n=rst4.getString("name");
                   String ca=rst4.getString("category");
                   String da=rst4.getString("detail");
                   String pa=rst4.getString("price");
                   String ia=rst4.getString("image");
               
            %>
            
            <div class="img-con1">
                
                     <div> <img style="width: 20rem;height: 20rem;" src="image/<%=ia%>"></div>
                     
                     <div class="bookname"><span ><%=n%></span></div>
                     <div><span style="margin-left: 1rem;margin-top: 1rem;font-size: 2rem; font-weight: 1.5rem;">&#8377;<%=pa%></span></div>
                    <div class="buy-button"><a href="showproduct.jsp?data=<%=n%>">Buy</a></div>
                    <div><span style="text-align: center;font-size: 1rem; font-weight: 1.5rem;"><%=ca%></span></div>
                      <div><span style="text-align: center;font-size: 1rem; font-weight: 1.5rem;"><%=da%></span></div>
                   
            </div>
            <%}%>
        </div>
        <div class="vegitable">
        <h1>Spices</h1>
        </div>
         
        <div class="img-con">
            <% 
                Connection conn5=ConnectionProvider.getConnection();
                PreparedStatement psa5=conn5.prepareStatement("select * from product where category=?");
                psa5.setString(1, "spices");
               ResultSet rst5=psa5.executeQuery();
               while(rst5.next()){
                   String n=rst5.getString("name");
                   String ca=rst5.getString("category");
                   String da=rst5.getString("detail");
                   String pa=rst5.getString("price");
                   String ia=rst5.getString("image");
               
            %>
            
            <div class="img-con1">
                
                     <div> <img style="width: 20rem;height: 20rem;" src="image/<%=ia%>"></div>
                     
                     <div class="bookname"><span ><%=n%></span></div>
                     <div><span style="margin-left: 1rem;margin-top: 1rem;font-size: 2rem; font-weight: 1.5rem;">&#8377;<%=pa%></span></div>
                    <div class="buy-button"><a href="showproduct.jsp?data=<%=n%>">Buy</a></div>
                    <div><span style="text-align: center;font-size: 1rem; font-weight: 1.5rem;"><%=ca%></span></div>
                      <div><span style="text-align: center;font-size: 1rem; font-weight: 1.5rem;"><%=da%></span></div>
                   
            </div>
            <%}%>
        </div>
        <div class="vegitable">
        <h1>Dairy</h1>
        </div>
         
        <div class="img-con">
            <% 
                Connection conn6=ConnectionProvider.getConnection();
                PreparedStatement psa6=conn6.prepareStatement("select * from product where category=?");
                psa6.setString(1, "dairy");
               ResultSet rst6=psa6.executeQuery();
               while(rst6.next()){
                   String n=rst6.getString("name");
                   String ca=rst6.getString("category");
                   String da=rst6.getString("detail");
                   String pa=rst6.getString("price");
                   String ia=rst6.getString("image");
               
            %>
            
            <div class="img-con1">
                
                     <div> <img style="width: 20rem;height: 20rem;" src="image/<%=ia%>"></div>
                     
                     <div class="bookname"><span ><%=n%></span></div>
                     <div><span style="margin-left: 1rem;margin-top: 1rem;font-size: 2rem; font-weight: 1.5rem;">&#8377;<%=pa%></span></div>
                    <div class="buy-button"><a href="showproduct.jsp?data=<%=n%>">Buy</a></div>
                    <div><span style="text-align: center;font-size: 1rem; font-weight: 1.5rem;"><%=ca%></span></div>
                      <div><span style="text-align: center;font-size: 1rem; font-weight: 1.5rem;"><%=da%></span></div>
                   
            </div>
            <%}%>
        </div>
    </body>
</html>
