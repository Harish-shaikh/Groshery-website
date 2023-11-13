package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"groshery.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registration</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"main-con\">\n");
      out.write("                <form method=\"post\" action=\"registar\"  onsubmit=\" return ab()\" enctype=\"multipart/form-data\">\n");
      out.write("                    <div class=\"registar\">\n");
      out.write("                    <div class=\"regis-con\">\n");
      out.write("                        <span>Name</span><br>\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter your name\" name=\"name\" id=\"names\"><br>\n");
      out.write("                       <span id=\"cn\" style=\"color:red ;font-size: 0.8rem;\"></span> <br>\n");
      out.write("                        <span>D.O.B</span><br>\n");
      out.write("                         <input type=\"date\" placeholder=\"Enter your dob \" name=\"dob\" id=\"dob\"><br><br>\n");
      out.write("                         <span>Mobile</span><br>\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter your mobile\"  id=\"mo\" name=\"mobile\"><br>\n");
      out.write("                        <span id=\"cm\" style=\"color:red ;font-size: 0.8rem;\"></span> <br>\n");
      out.write("                        <span>Password</span><br>\n");
      out.write("                        <input type=\"password\" placeholder=\"Enter your password\"  required name=\"password\" id=\"pass1\"><br>\n");
      out.write("                        <span id=\"cpp\" style=\"color:red ;font-size: 0.8rem;\"></span> <br>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"regis-con\">\n");
      out.write("                        <span>Email</span><br>\n");
      out.write("                        <input type=\"email\" placeholder=\"Enter your email\"   id=\"em\" name=\"email\"><br>\n");
      out.write("                         <span id=\"ce\" style=\"color:red ;font-size: 0.8rem;\"></span> <br>\n");
      out.write("                       \n");
      out.write("                        <span>Image</span><br>\n");
      out.write("                        <input type=\"file\"   required name=\"image\"><br><br>\n");
      out.write("                       \n");
      out.write("                        <span>Address</span><br>\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter your address\" id=\"add\" name=\"address\" required><br><br>\n");
      out.write("                        <span>Confirm.Password</span><br>\n");
      out.write("                        <input type=\"text\" placeholder=\"confirm password \" name=\"confirm\" id=\"pass2\"><br>\n");
      out.write("                        <span id=\"cp\" style=\"color:red ;font-size: 0.8rem;\"></span> <br>\n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sub-button\">\n");
      out.write("                        <button type=\"submit\">Submit</button>\n");
      out.write("                        </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    <script>\n");
      out.write("        function ab(){\n");
      out.write("            //password\n");
      out.write("       let a=document.getElementById(\"pass1\").value;\n");
      out.write("       let cp=/^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!])(?=.*[0-9])[a-zA-Z0-9!@#$%]{8,12}$/;\n");
      out.write("       if(cp.test(a)){\n");
      out.write("           \n");
      out.write("       }else{\n");
      out.write("           let cpps=document.getElementById(\"cpp\").innerHTML=\"8 character\";\n");
      out.write("           return false;\n");
      out.write("       }\n");
      out.write("       \n");
      out.write("       let b=document.getElementById(\"pass2\").value;\n");
      out.write("       \n");
      out.write("       if(a.match(b)){\n");
      out.write("           \n");
      out.write("       }\n");
      out.write("       else{\n");
      out.write("           document.getElementById(\"cp\").innerHTML=\"password not found\";\n");
      out.write("           return false;\n");
      out.write("       }\n");
      out.write("//name\n");
      out.write("      var n=document.getElementById(\"names\").value;\n");
      out.write("      \n");
      out.write("          var namepattern=/^[a-zA-Z ]{3,30}$/;\n");
      out.write("  if(namepattern.test(n)){\n");
      out.write("     \n");
      out.write("  }\n");
      out.write("  else{\n");
      out.write("      let cna=document.getElementById(\"cn\").innerHTML=\"please enter valid name\";\n");
      out.write("      return false;\n");
      out.write("  }\n");
      out.write("  //mobile number\n");
      out.write("        let m=document.getElementById(\"mo\").value;\n");
      out.write("        let mobilepattern=/^[789]{1}[0-9]{9}$/;\n");
      out.write("        if(mobilepattern.test(m)){\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        else{\n");
      out.write("            let cm=document.getElementById(\"cm\").innerHTML=\"please enter valid number\";\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        //Email\n");
      out.write("     let e=document.getElementById(\"em\").value;\n");
      out.write("        let emailpattern=/^[a-z0-9]{1,}[@]{1}[a-z]{2,10}[.]{1}[a-z]{2,10}$/;\n");
      out.write("        if(emailpattern.test(e)){\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        else{\n");
      out.write("            let cem=document.getElementById(\"ce\").innerHTML=\"Wrong email id\";\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("       let f=document.getElementByID(\"add\").value;\n");
      out.write("       \n");
      out.write("        let g=document.getElementById(\"dob\").value;\n");
      out.write(" \n");
      out.write("        }\n");
      out.write("    </script>\n");
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
