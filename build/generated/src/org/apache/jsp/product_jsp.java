package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"groshery.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"product\">\n");
      out.write("            <div class=\"product-form\">\n");
      out.write("                <form id=\"form\"  method=\"post\" action=\"products\" enctype=\"multipart/form-data\" onsubmit=\"ab()\">\n");
      out.write("                <div class=\"product-con\">\n");
      out.write("                    <div class=\"product-detail\">\n");
      out.write("                        <span>Product.Name</span><br><br>\n");
      out.write("                        <span>Product.Category</span><br><br>\n");
      out.write("                      <span>Product.detail </span><br><br>\n");
      out.write("                      <span>Product.price</span><br><br>\n");
      out.write("                      <span>Product.Image</span><br><br>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product-input\">\n");
      out.write("                    <input type=\"text\" id=\"na\" name=\"name\" placeholder=\"Enter product name\" required><br><br>\n");
      out.write("                   \n");
      out.write("                    <input type=\"text\" name=\"category\" placeholder=\"Enter product Category\" required><br><br>\n");
      out.write("                   \n");
      out.write("                    <input type=\"text\" name=\"detail\" placeholder=\"Enter product detail\" required><br><br>\n");
      out.write("                    \n");
      out.write("                    <input type=\"text\" name=\"price\" placeholder=\"Enter product price\" required><br><br>\n");
      out.write("                    \n");
      out.write("                    <input type=\"file\" name=\"image\"  required><br><br>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("                <div class=\"product-button\">\n");
      out.write("                    <button type=\"submit\">Submit</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("         <script>\n");
      out.write("            function ab()\n");
      out.write("            {\n");
      out.write("               \n");
      out.write("              \n");
      out.write("              let a=document.getElementById(\"na\").value;\n");
      out.write("              if(n.length==0){\n");
      out.write("              alert(\"please enter data\");\n");
      out.write("          }\n");
      out.write("            }\n");
      out.write("            document.getElementById(\"form\").addEventListener(\"on\");\n");
      out.write("            </script>\n");
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
