package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"groshery.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"login-page\">\n");
      out.write("            <div class=\"login-page2\">\n");
      out.write("                <h1>Login</h1>\n");
      out.write("            <form method=\"post\" action=\"log\">\n");
      out.write("                <div class=\"login-con\">\n");
      out.write("                    <span>Enter Email/Mobile number</span><br>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter Mobile.no/Email\" name=\"email\" required><br><br><br>\n");
      out.write("                    \n");
      out.write("                    <span>Enter Password</span><br>\n");
      out.write("                    <input type=\"password\" placeholder=\"Enter your password\" name=\"password\" required><br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"Forget\">\n");
      out.write("                    <a href=\"#\">Forget?</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"login-team\">\n");
      out.write("                    <p>By continuing, you agree to Groshery<a href=\"#\"> Terms of Use</a> and <a href=\"#\">Privacy Policy</a>.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"login-button\">\n");
      out.write("                    <button type=\"submit\">Login</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"registration\">\n");
      out.write("                    <a href=\"regist.jsp\">New Registration</a>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
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
