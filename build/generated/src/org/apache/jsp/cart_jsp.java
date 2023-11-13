package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import Entity.ragistars;
import java.sql.PreparedStatement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import helper.ConnectionProvider;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"groshery.css\">\n");
      out.write("        ");
 ragistars rsss=(ragistars)session.getAttribute("data");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cart</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: lightgrey;\">\n");
      out.write("        <div class=\"Add-product\">\n");
      out.write("            \n");
      out.write("            ");

                
            Connection con=ConnectionProvider.getConnection();
            PreparedStatement pst=con.prepareStatement("select * from cart where email=?");
            pst.setString(1,rsss.getName());
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                String n=rs.getString("name");
                  String i=rs.getString("image");
                    String r=rs.getString("rs");
            
            
      out.write("\n");
      out.write("            <div class=\"carts\">\n");
      out.write("            <div class=\"added-product\">\n");
      out.write("                <img src=\"image/");
      out.print(i);
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cart-pname\">\n");
      out.write("                \n");
      out.write("                <h1>");
      out.print(n);
      out.write("</h1>\n");
      out.write("                 \n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("                <h1 style=\"margin-left: 50rem;margin-top: -1rem\">&#8377;");
      out.print(r);
      out.write("</h1>\n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("       \n");
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
