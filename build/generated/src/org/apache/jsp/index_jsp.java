package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entity.ragistars;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import helper.ConnectionProvider;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
 ragistars rsss=(ragistars)session.getAttribute("data");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"groshery.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>groshery</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <div class=\"nav\">\n");
      out.write("                <h1><marquee>Groshery</marquee></h1>\n");
      out.write("                <input type=\"text\" placeholder=\"search\">\n");
      out.write("                <button class=\"fa fa-search\"></button>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"nav-list\">\n");
      out.write("               <div class=\"img-data\">\n");
      out.write("                ");
if(rsss!=null){
      out.write("\n");
      out.write("                <div class=\"name\">\n");
      out.write("                    <li> ");
      out.print(rsss.getName());
      out.write("</li> \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <li><a href=\"logout\">Logout</a></li>\n");
      out.write("                \n");
      out.write("                <div class=\"imgs\">\n");
      out.write("                     \n");
      out.write("                <li><img src=\"image/user/");
      out.print(rsss.getImage());
      out.write("\" style=\" display: flex;margin-top: -1.8rem;\"></li>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("              \n");
      out.write("                ");
} else{
      out.write("\n");
      out.write("                \n");
      out.write("                <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("               </div>\n");
      out.write("                 <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                <li><a href=\"cart.jsp\" class=\"fa fa-shopping-cart\"></a></li>\n");
      out.write("                <li><a href=\"#\">Home</a></li>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("               <div class=\"title\">\n");
      out.write("                   <span style=\"margin-top: 12rem;display: flex;\">Welcome to <br>Groshery</span>\n");
      out.write("                   \n");
      out.write("            </div>\n");
      out.write("        <div class=\"nav-img\">\n");
      out.write("            <img src=\"image/shopping2_1.jpg\">\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("        <div class=\"vegitable\">\n");
      out.write("        <h1>Vegitable</h1>\n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("        <div class=\"img-con\">\n");
      out.write("            ");
 
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
               
            
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"img-con1\">\n");
      out.write("                \n");
      out.write("                     <div><img style=\"width: 20rem;height: 20rem;\" src=\"image/");
      out.print(i);
      out.write("\"></div>\n");
      out.write("                     \n");
      out.write("                     <div class=\"bookname\"><span >");
      out.print(n);
      out.write("</span></div>\n");
      out.write("                     <div><span style=\"margin-left: 1rem;margin-top: 1rem;font-size: 2rem; font-weight: 1.5rem;\">&#8377;");
      out.print(p);
      out.write("</span></div>\n");
      out.write("                     <div class=\"buy-button\"><a href=\"showproduct.jsp?data=");
      out.print(n);
      out.write("\">Buy</a></div>\n");
      out.write("                    <div><span style=\"text-align: center;font-size: 1rem; font-weight: 1.5rem;\">");
      out.print(c);
      out.write("</span></div>\n");
      out.write("                      <div><span style=\"text-align: center;font-size: 1rem; font-weight: 1.5rem;\">");
      out.print(d);
      out.write("</span></div>\n");
      out.write("                   \n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"vegitable\">\n");
      out.write("        <h1>Fruit</h1>\n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("        <div class=\"img-con\">\n");
      out.write("            ");
 
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
               
            
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"img-con1\">\n");
      out.write("                \n");
      out.write("                     <div> <img style=\"width: 20rem;height: 20rem;\" src=\"image/");
      out.print(ia);
      out.write("\"></div>\n");
      out.write("                     \n");
      out.write("                     <div class=\"bookname\"><span >");
      out.print(n);
      out.write("</span></div>\n");
      out.write("                     <div><span style=\"margin-left: 1rem;margin-top: 1rem;font-size: 2rem; font-weight: 1.5rem;\">&#8377;");
      out.print(pa);
      out.write("</span></div>\n");
      out.write("                    <div class=\"buy-button\"><a href=\"showproduct.jsp?data=");
      out.print(n);
      out.write("\">Buy</a></div>\n");
      out.write("                    <div><span style=\"text-align: center;font-size: 1rem; font-weight: 1.5rem;\">");
      out.print(ca);
      out.write("</span></div>\n");
      out.write("                      <div><span style=\"text-align: center;font-size: 1rem; font-weight: 1.5rem;\">");
      out.print(da);
      out.write("</span></div>\n");
      out.write("                   \n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("      <div class=\"vegitable\">\n");
      out.write("        <h1>DryFruit</h1>\n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("        <div class=\"img-con\">\n");
      out.write("            ");
 
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
               
            
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"img-con1\">\n");
      out.write("                \n");
      out.write("                     <div> <img style=\"width: 20rem;height: 20rem;\" src=\"image/");
      out.print(ia);
      out.write("\"></div>\n");
      out.write("                     \n");
      out.write("                     <div class=\"bookname\"><span >");
      out.print(n);
      out.write("</span></div>\n");
      out.write("                     <div><span style=\"margin-left: 1rem;margin-top: 1rem;font-size: 2rem; font-weight: 1.5rem;\">&#8377;");
      out.print(pa);
      out.write("</span></div>\n");
      out.write("                    <div class=\"buy-button\"><a href=\"showproduct.jsp?data=");
      out.print(n);
      out.write("\">Buy</a></div>\n");
      out.write("                    <div><span style=\"text-align: center;font-size: 1rem; font-weight: 1.5rem;\">");
      out.print(ca);
      out.write("</span></div>\n");
      out.write("                      <div><span style=\"text-align: center;font-size: 1rem; font-weight: 1.5rem;\">");
      out.print(da);
      out.write("</span></div>\n");
      out.write("                   \n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"vegitable\">\n");
      out.write("        <h1>Eggs&Meat</h1>\n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("        <div class=\"img-con\">\n");
      out.write("            ");
 
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
               
            
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"img-con1\">\n");
      out.write("                \n");
      out.write("                     <div> <img style=\"width: 20rem;height: 20rem;\" src=\"image/");
      out.print(ia);
      out.write("\"></div>\n");
      out.write("                     \n");
      out.write("                     <div class=\"bookname\"><span >");
      out.print(n);
      out.write("</span></div>\n");
      out.write("                     <div><span style=\"margin-left: 1rem;margin-top: 1rem;font-size: 2rem; font-weight: 1.5rem;\">&#8377;");
      out.print(pa);
      out.write("</span></div>\n");
      out.write("                    <div class=\"buy-button\"><a href=\"showproduct.jsp?data=");
      out.print(n);
      out.write("\">Buy</a></div>\n");
      out.write("                    <div><span style=\"text-align: center;font-size: 1rem; font-weight: 1.5rem;\">");
      out.print(ca);
      out.write("</span></div>\n");
      out.write("                      <div><span style=\"text-align: center;font-size: 1rem; font-weight: 1.5rem;\">");
      out.print(da);
      out.write("</span></div>\n");
      out.write("                   \n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"vegitable\">\n");
      out.write("        <h1>Grains</h1>\n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("        <div class=\"img-con\">\n");
      out.write("            ");
 
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
               
            
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"img-con1\">\n");
      out.write("                \n");
      out.write("                     <div> <img style=\"width: 20rem;height: 20rem;\" src=\"image/");
      out.print(ia);
      out.write("\"></div>\n");
      out.write("                     \n");
      out.write("                     <div class=\"bookname\"><span >");
      out.print(n);
      out.write("</span></div>\n");
      out.write("                     <div><span style=\"margin-left: 1rem;margin-top: 1rem;font-size: 2rem; font-weight: 1.5rem;\">&#8377;");
      out.print(pa);
      out.write("</span></div>\n");
      out.write("                    <div class=\"buy-button\"><a href=\"showproduct.jsp?data=");
      out.print(n);
      out.write("\">Buy</a></div>\n");
      out.write("                    <div><span style=\"text-align: center;font-size: 1rem; font-weight: 1.5rem;\">");
      out.print(ca);
      out.write("</span></div>\n");
      out.write("                      <div><span style=\"text-align: center;font-size: 1rem; font-weight: 1.5rem;\">");
      out.print(da);
      out.write("</span></div>\n");
      out.write("                   \n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"vegitable\">\n");
      out.write("        <h1>Spices</h1>\n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("        <div class=\"img-con\">\n");
      out.write("            ");
 
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
               
            
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"img-con1\">\n");
      out.write("                \n");
      out.write("                     <div> <img style=\"width: 20rem;height: 20rem;\" src=\"image/");
      out.print(ia);
      out.write("\"></div>\n");
      out.write("                     \n");
      out.write("                     <div class=\"bookname\"><span >");
      out.print(n);
      out.write("</span></div>\n");
      out.write("                     <div><span style=\"margin-left: 1rem;margin-top: 1rem;font-size: 2rem; font-weight: 1.5rem;\">&#8377;");
      out.print(pa);
      out.write("</span></div>\n");
      out.write("                    <div class=\"buy-button\"><a href=\"showproduct.jsp?data=");
      out.print(n);
      out.write("\">Buy</a></div>\n");
      out.write("                    <div><span style=\"text-align: center;font-size: 1rem; font-weight: 1.5rem;\">");
      out.print(ca);
      out.write("</span></div>\n");
      out.write("                      <div><span style=\"text-align: center;font-size: 1rem; font-weight: 1.5rem;\">");
      out.print(da);
      out.write("</span></div>\n");
      out.write("                   \n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"vegitable\">\n");
      out.write("        <h1>Dairy</h1>\n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("        <div class=\"img-con\">\n");
      out.write("            ");
 
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
               
            
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"img-con1\">\n");
      out.write("                \n");
      out.write("                     <div> <img style=\"width: 20rem;height: 20rem;\" src=\"image/");
      out.print(ia);
      out.write("\"></div>\n");
      out.write("                     \n");
      out.write("                     <div class=\"bookname\"><span >");
      out.print(n);
      out.write("</span></div>\n");
      out.write("                     <div><span style=\"margin-left: 1rem;margin-top: 1rem;font-size: 2rem; font-weight: 1.5rem;\">&#8377;");
      out.print(pa);
      out.write("</span></div>\n");
      out.write("                    <div class=\"buy-button\"><a href=\"showproduct.jsp?data=");
      out.print(n);
      out.write("\">Buy</a></div>\n");
      out.write("                    <div><span style=\"text-align: center;font-size: 1rem; font-weight: 1.5rem;\">");
      out.print(ca);
      out.write("</span></div>\n");
      out.write("                      <div><span style=\"text-align: center;font-size: 1rem; font-weight: 1.5rem;\">");
      out.print(da);
      out.write("</span></div>\n");
      out.write("                   \n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
