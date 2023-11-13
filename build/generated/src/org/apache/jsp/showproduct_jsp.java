package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import helper.ConnectionProvider;

public final class showproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"groshery.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Show product</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: lightgray;\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
 
            Connection con=ConnectionProvider.getConnection();
            String h=request.getParameter("data");
            PreparedStatement pst=con.prepareStatement("select * from product where name=?");
        pst.setString(1, h);
        ResultSet rst=pst.executeQuery();
        while(rst.next()){
           
            String i=rst.getString("image");
            String m=rst.getString("price");
            String d=rst.getString("detail");
            
        
      
      out.write("\n");
      out.write("        <div class=\"showproduct\">\n");
      out.write("            \n");
      out.write("      <div class=\"imgs1\">\n");
      out.write("          <img src=\"image/");
      out.print(i);
      out.write("\" style=\"width: 30rem; height: 30rem;\">\n");
      out.write("     \n");
      out.write("          <div class=\"buttons-but\">\n");
      out.write("              \n");
      out.write("              <a href=\"carts?rst=");
      out.print(h);
      out.write("\">Add cart</a>\n");
      out.write("              <a href=\"#\" style=\"background-color: red;\">Buy now</a>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("        <div class=\"show\">\n");
      out.write("            <h1>");
      out.print(h);
      out.write("</h1>\n");
      out.write("            <span style=\"font-size:2.5rem; font-weight: 600;\">&#8377;");
      out.print(m);
      out.write("</span><br>\n");
      out.write("            <span>");
      out.print(d);
      out.write("</span><br>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <div class=\"offers\">\n");
      out.write("            \n");
      out.write("            <span style=\"font-size: 1.5rem;font-weight: 600;\">Available offers</span><br><br>\n");
      out.write("           \n");
      out.write("                <span> Bank Offer5%</span> Instant Discount on HDFC Bank Cards and EMI Transactions <a href=\"#\">T&C</a><br>\n");
      out.write("\n");
      out.write("            <span>Bank Offer5%</span> Unlimited Cashback on Flipkart Axis Bank Credit Card<a href=\"#\">T&C</a><br>\n");
      out.write("\n");
      out.write("            <span> Bank Offer20%</span> off on 1st txn with Amex Network Cards issued by ICICI Bank,\n");
      out.write("            <br>IndusInd Bank,SBI Cards and Mobikwik<a href=\"#\">T&C</a><br>\n");
      out.write("                \n");
      out.write("            <span>   Bank Offer15%</span> Instant discount on first Pay Later order of ₹500 and above<a href=\"#\">T&C</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"feedback\">\n");
      out.write("            <span>\n");
      out.write("                Feedback&Review:-\n");
      out.write("            </span>\n");
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
