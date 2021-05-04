package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Regis_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/nav.jsp");
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
      out.write(" \n");
      out.write("<html> \n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"xyz.css\">\n");
      out.write("<script type=\"text/javascript\" src=\"abc.js\">\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>  \n");
      out.write("    ");
      out.write("\n");
      out.write("<div id=\"mymenu\">\n");
      out.write("\t<ul>\n");
      out.write("\t<li>Home</li>\n");
      out.write("\t<li> <a href=\"Login.jsp\">LogIn</a></li>\n");
      out.write("\t<li> <a href=\"Regis.jsp\">Registration</a></li>\n");
      out.write("\t<li>About</li>\n");
      out.write("\t<li>Contact</li>\n");
      out.write("\t</ul>\n");
      out.write("</div>");
      out.write("  \n");
      out.write("\n");
      out.write("<div id=\"data\">\n");
      out.write("    <form action=\"RegisInsert.jsp\" onsubmit=\"return demo()\" method=\"get\">\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("\t\n");
      out.write("   <table cellpadding=\"12px\">\n");
      out.write("   \n");
      out.write("\t<caption style=\"color:white;font-weight:bold;font-size:25px;\">Registration Page</caption>\n");
      out.write("   <tr>\n");
      out.write("   <td>Enter Name</td>\n");
      out.write("   <td><input type=\"text\" name=\"un\" id=\"a\"  placeholder=\"Enter Name\"></td>\n");
      out.write("   </tr>\n");
      out.write("   <tr>\n");
      out.write("   <td>Enter Password</td>\n");
      out.write("   <td><input type=\"password\" name=\"up\" id=\"b\" placeholder=\"Enter Password\"></td>\n");
      out.write("   </tr>  \n");
      out.write("   <tr>\n");
      out.write("   <td>Enter Email</td>\n");
      out.write("   <td><input type=\"email\" name=\"email\" id=\"c\" placeholder=\"Enter Email\"></td>\n");
      out.write("   </tr>\n");
      out.write("   <tr>\n");
      out.write("   <td>Enter DOB</td>\n");
      out.write("   <td><input type=\"date\" name=\"date1\" placeholder=\"dd-mm-yy\"></td>\n");
      out.write("   </tr>    \n");
      out.write("   <tr>\n");
      out.write("   <td>Gender</td>\n");
      out.write("   <td><input type=\"radio\" name=\"gender\" value=\"Male\">Male<input type=\"radio\" name=\"gender\" value=\"Female\">Female</td>\n");
      out.write("   </tr> \n");
      out.write("   <tr>\n");
      out.write("   <td>Contact Number</td>\n");
      out.write("   <td><input type=\"text\" name=\"num\" id=\"d\" placeholder=\"Phone Number\"></td>\n");
      out.write("   </tr> \n");
      out.write("   <tr>\n");
      out.write("   <th colspan=\"2\"><input type=\"submit\" name=\"form1\" value=\"Registration\" class=\"B\"></th>\n");
      out.write("   </tr> \n");
      out.write("     \n");
      out.write("   </table>\n");
      out.write("    </center>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    ");

    String j=request.getParameter("form1");
    
    if(j!=null)
    {
     
String s1=request.getParameter("un");
String s2=request.getParameter("up");
String s3=request.getParameter("email");
String s4=request.getParameter("date1");
String s5=request.getParameter("gender");
String s6=request.getParameter("num");


 try
		 {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			String db_url="jdbc:mysql://localhost:3307/onlineexam?useSSL=false&allowPublicKeyRetrieval=true";
			String db_name="root";
			String db_pass="root";
			
			Connection con=DriverManager.getConnection(db_url,db_name,db_pass);
			 
			Statement st= con.createStatement();
			  String q="insert into regis values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"');";
			 st.executeUpdate(q);
			 response.sendRedirect("Login.jsp"); 
			con.close();
		 }
         catch(Exception e1)
		 {
			 out.println(e1);
		 }		 
	

    
    
    }
    
      out.write("\n");
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
