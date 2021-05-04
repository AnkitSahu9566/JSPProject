package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("       \n");
      out.write("\n");
      out.write("<html> \n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"xyz.css\">\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    \n");
      out.write("   function demo()\n");
      out.write("   {\n");
      out.write("       a=document.getElementById('t1').value;\n");
      out.write("        if(a.length>=8)\n");
      out.write("        {\n");
      out.write("            document.getElementById('sp2').innerHTML=\"STRONG\";\n");
      out.write("            document.getElementById('sp2').style.color='green'\n");
      out.write("        }\n");
      out.write("        else if(a.length>4)\n");
      out.write("        {\n");
      out.write("            document.getElementById('sp2').innerHTML=\"AVERAGE\";\n");
      out.write("            document.getElementById('sp2').style.color='yellow'\n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            document.getElementById('sp2').innerHTML=\"WEAK\";\n");
      out.write("            document.getElementById('sp2').style.color='red'\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("   }\n");
      out.write(" \n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>  \n");
      out.write("\n");
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
      out.write("\n");
      out.write("  \n");
      out.write("<div id=\"data\">\n");
      out.write("    \n");
      out.write("<form action=\"Login.jsp\" method=\"get\">\n");
      out.write("\n");
      out.write("   <center>\n");
      out.write("       ");

   String b=request.getParameter("s");
   if(b!=null)
   {
   
      out.write("\n");
      out.write("  \n");
      out.write("   <span style=\"color:red;font-size:25pt;\"> ");
      out.print( b );
      out.write("</span>\n");
      out.write(" \n");
      out.write("   ");
 } 
      out.write("\n");
      out.write("   <table cellpadding=\"12px\">\n");
      out.write("   \n");
      out.write("\t<caption style=\"color:white;font-weight:bold;font-size:25px;\">Login Page</caption>\n");
      out.write("   <tr>\n");
      out.write("   <td>Enter Name</td>\n");
      out.write("   <td><input type=\"text\" name=\"un\"  placeholder=\"Enter Name\"></td> \n");
      out.write("   </tr>\n");
      out.write("   <tr>\n");
      out.write("   <td>Enter Password</td>\n");
      out.write("   <td><input type=\"password\" name=\"up\" id='t1'onkeyup=\"demo()\" placeholder=\"Enter Password\"> </td>\n");
      out.write("   <th >  <span id=\"sp2\" style=\"font-size:12px;\"></span></th>\n");
      out.write("   </tr>\n");
      out.write("   <tr>\n");
      out.write("   <th colspan=\"2\"><input type=\"submit\" name=\"form1\" value=\"Login\" class=\"B\"></th>\n");
      out.write("   </tr> \n");
      out.write("     \n");
      out.write("   </table>\n");
      out.write("    </center>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("   ");

   String j=request.getParameter("form1");
   if(j!=null)
   {

String s1=request.getParameter("un");
String s2=request.getParameter("up");
       
         try
		 {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			String db_url="jdbc:mysql://localhost:3307/onlineexam?useSSL=false&allowPublicKeyRetrieval=true";
			String db_name="root";
			String db_pass="root";
			
			Connection con=DriverManager.getConnection(db_url,db_name,db_pass);
			 
			Statement st= con.createStatement();
			  String q="select * from regis where UName='"+s1+"' AND UPass='"+s2+"';";
			 ResultSet re=st.executeQuery(q);
			 if(re.next())
			 {
                            Cookie ck=new Cookie("un",s1);
                            ck.setMaxAge(60*60);
                            response.addCookie(ck);
			    response.sendRedirect("MyMenu.jsp?uname="+s1+"");
			 }
			 else
			 {
				response.sendRedirect("Login.jsp?s=Invalid Name and Pass");
			 }
			 con.close();
		 }
         catch(Exception e1)
		 {
			 out.println(e1);
		 }		 
		
	
       
   }
   
      out.write("\n");
      out.write("   \n");
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
