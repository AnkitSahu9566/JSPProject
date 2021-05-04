package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MyMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/menunav.jsp");
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

      out.write("<html> \n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"xyz.css\">\n");
      out.write("</head>\n");
      out.write("<body>  \n");
      out.write("    ");
      out.write("\n");
      out.write("<div id=\"mymenu\">\n");
      out.write("\t<ul>\n");
      out.write("\t<li><a href=\"MyMenu.jsp\">Home</a></li>\n");
      out.write("\t<li> <a href=\"Insert.jsp\">Insert</a></li>\n");
      out.write("\t<li> <a href=\"Search.jsp\">Search</a></li>\n");
      out.write("\t<li> <a href=\"ShowAll.jsp\">ShowAll</a></li>\t\n");
      out.write("\t<li> <a href=\"Update.jsp\">Update</a></li>\n");
      out.write("\t<li> <a href=\"Delete.jsp\">Delete</a></li>\n");
      out.write("\t<li><a href=\"Login.jsp\">LogOut</a></li>\n");
      out.write("\t<li><a href=\"About.jsp\">About</a></li>\n");
      out.write("\t </ul>\n");
      out.write("</div>");
      out.write("\n");
      out.write("    <hr>\n");
 String ss=request.getParameter("uname");
      out.write("\n");
      out.write("<div id=\"data\">\n");
      out.write("<form action=\"Mymenu\" method=\"get\">\n");
      out.write("\n");
      out.write("      <center>\n");
      out.write("\t\n");
      out.write("   <table cellpadding=\"12px\" width=\"300\"height=\"200\">\n");
      out.write("   \n");
      out.write("\t<caption style=\"color:white;font-weight:bold;font-size:25px;\"></caption>\n");
      out.write("   <tr>\n");
      out.write("    \n");
      out.write("   <th colspan=\"5\"> Welcome ");
      out.print(ss);
      out.write("</th>\n");
      out.write("   </tr> \n");
      out.write("     \n");
      out.write("   </table>\n");
      out.write("    </center> \n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("     \n");
      out.write("   <center>\n");
      out.write("    <footer>  \n");
      out.write("        ");
      out.write("<hr><center>\n");
      out.write("            <font style=\"color:white;font-weight:bold;font-size:25px;background:red;\">Contact Us </font>\n");
      out.write("</center> \n");
      out.write("\n");
      out.write("<table> \n");
      out.write("<tr>\n");
      out.write("<td>    \n");
      out.write("<div id=\"data1\" style=\"display:inline-block;width:50px;\">       \n");
      out.write("                <table cellpadding=\"12px\">\n");
      out.write("                <caption style=\"color:white;font-weight:bold;font-size:25px;\">Any Complain...</caption>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                <td>Enter Name</td>\n");
      out.write("                <td><input type=\"text\" name=\"un\" placeholder=\"Enter Name\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <td>Enter Email</td>\n");
      out.write("                <td><input type=\"email\" name=\"up\" placeholder=\"Enter Email\"></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">Suggestion:</td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr > \n");
      out.write("                <td colspan=\"2\"><textarea rows=\"5\"cols=\"35\" placeholder=\"Type Here!\"></textarea></td>\n");
      out.write("                </tr>  \n");
      out.write("                <tr>\n");
      out.write("                <th colspan=\"2\"><input type=\"submit\" value=\"Submit\" class=\"B\"></th>\n");
      out.write("                </tr> \n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("        </div>  \n");
      out.write("   </td> \n");
      out.write("   <th>\n");
      out.write("        <div id=\"data1\" style=\"display:inline-block; \"> \n");
      out.write("            \n");
      out.write("                <table cellpadding=\"12px\">\n");
      out.write("                <caption style=\"color:white;font-weight:bold;font-size:25px;\">Home:&nbsp;&nbsp;&nbsp;&nbsp;Services</caption>\n");
      out.write("                 \n");
      out.write("                <tr>\n");
      out.write("                <td> <font>Home:&nbsp;&nbsp;&nbsp;&nbsp;Services</font></td>\n");
      out.write("                 </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <font >Insert:&nbsp;&nbsp;&nbsp;&nbsp;Insert Marks</font></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><font>Search:&nbsp;&nbsp;&nbsp;&nbsp;Search Student</font></td>\n");
      out.write("                 </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td> <font >ShowAll:&nbsp;&nbsp;&nbsp;&nbsp;See All Student</font></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><font>Update:&nbsp;&nbsp;&nbsp;&nbsp;Update Student detail</font></td>\n");
      out.write("                 </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td><font>Delete:&nbsp;&nbsp;&nbsp;&nbsp;Delete Student detail</font></td>\n");
      out.write("                 </tr>\n");
      out.write("\n");
      out.write("                 </table>\n");
      out.write("        </div >  \n");
      out.write("      </th>\n");
      out.write("      <td>\n");
      out.write("        <div id=\"data1\" style=\"display:inline-block;width:50px;padding-right:60px;\">    \n");
      out.write("                <table cellpadding=\"12px\" >\n");
      out.write("                <caption style=\"color:white;font-weight:bold;font-size:25px;\">Contact Us...</caption>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <font >Scheme No.54,Vijay Nagar ,Indore</font></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <td> <font>Name:&nbsp;&nbsp;Ankit Sahu</font></td>\n");
      out.write("                 </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <font >Email:&nbsp;&nbsp;ankitkhujner.110102@gmail.com</font></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <font >Contact:&nbsp;&nbsp;9584129566</font></td>\n");
      out.write("                 </tr>\n");
      out.write("\n");
      out.write("                 </table>\n");
      out.write("        </div>\n");
      out.write("      </td>\n");
      out.write("      </tr>\n");
      out.write("          \n");
      out.write("    </table>");
      out.write("         \n");
      out.write("    </footer>\n");
      out.write("   </center>\n");
      out.write("      \n");
      out.write("</body>\n");
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
