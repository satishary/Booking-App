package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import databasepackage.DbConnect;
import utilities.Utilities;

public final class bookingstart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      response.setContentType("text/html");
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    \n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\n");
      out.write("  ");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("     <a class=\"navbar-brand\" href=\"#\">Booking App</a>\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Home</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDarkDropdown\" aria-controls=\"navbarNavDarkDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNavDarkDropdown\">\n");
      out.write("      <ul class=\"navbar-nav\">\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("            Booking Start\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu dropdown-menu-dark\">\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"bookingstart.jsp\"> Start Booking</a></li>\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"validation.jsp\">validation</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("    <!--Content-->\n");
      out.write("<body>\n");
      out.write("    ");

        String otp = "",mobile="",result="";
        boolean ispostback = false;
        if (request.getParameter("check") != null) {
            ispostback = true;
           
        }
        if (ispostback) {
                 try{
                   otp = Utilities.otp(5);
            mobile=request.getParameter("mobile");
            PreparedStatement ps=DbConnect.connect().prepareStatement("insert into bookings values=?");
           ps.setString(1,mobile); 
           result="Inserted";
             }
             catch(Exception ex){
                     System.out.println("ex");
                     result=ex.getMessage();
                     }
        }
    
      out.write("\n");
      out.write("    \n");
      out.write("    <center>\n");
      out.write("          <br>\n");
      out.write("    <br>\n");
      out.write("    <h1>Booking App</h1>\n");
      out.write("    <div class=\"container col-md-3\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3\"></div\n");
      out.write("            <div class=\"col-md-6\"></div>\n");
      out.write("    <form method=\"post\">\n");
      out.write("        ");
      out.print(result);
      out.write("\n");
      out.write("        <input name=\"check\" type=\"hidden\"/>\n");
      out.write("        <div class=\"mb-3\">\n");
      out.write("  <label for=\"exampleFormControlInput1\" class=\"form-label\">Enter mobile number</label>\n");
      out.write("  <input name=\"number\" type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Enter mobile number\" value=\"");
      out.print(mobile);
      out.write("\">\n");
      out.write("</div>\n");
      out.write("   <div class=\"col-md-3\">\n");
      out.write("  <input  type=\"submit\" class=\"form-control btn btn-danger\" id=\"exampleFormControlInput1\" value=\"Get Otp\">\n");
      out.write("</div>\n");
      out.write(" <div class=\"col\">\n");
      out.write("  <label for=\"exampleFormControlInput1\" class=\"form-label\">OTP</label>\n");
      out.write("  <input name=\"otp\" name=\"text\" readonly type=\"number\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"Enter OTP\"value=\"");
      out.print(otp);
      out.write("\">\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<div class=\"col-md-3\">\n");
      out.write("<input type=\"submit\"class=\"form-control btn btn-primary\">\n");
      out.write("</div>\n");
      out.write("        <br>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("</center>\n");
      out.write(" <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
