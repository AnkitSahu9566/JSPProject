package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Insert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menunav.jsp");
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
      out.write("<html> \n");
      out.write("<head>\n");
      out.write("\n");
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
      out.write("    ");
 String k=request.getParameter("val");
      out.write("\n");
      out.write("<div id=\"data\">\n");
      out.write("<form action=\"Insert.jsp\" method=\"get\">\n");
      out.write("\n");
      out.write("     <center>\n");
      out.write("         ");

             if(k != null)
             {
          
      out.write("\n");
      out.write("             \n");
      out.write("\t<span style=\"color:red;\">");
      out.print( k );
      out.write("</span>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("   <table cellpadding=\"12px\">\n");
      out.write("   \n");
      out.write("   <caption style=\"color:white;font-weight:bold;font-size:25px;\">Insert Your Data Here</caption>\n");
      out.write("   <tr>\n");
      out.write("   <td>Enter Roll</td>\n");
      out.write("   <td><input type=\"text\" name=\"u1\" placeholder=\"Enter Roll\">\n");
      out.write("   </tr>     \n");
      out.write("   <tr>\n");
      out.write("   <td>Enter Name</td>\n");
      out.write("   <td><input type=\"text\" name=\"u2\" placeholder=\"Enter Name\">\n");
      out.write("   </tr>\n");
      out.write("   <tr>\n");
      out.write("   <td>Physics</td>\n");
      out.write("   <td><input type=\"text\" name=\"u3\" placeholder=\"Enter Physics\"></td>\n");
      out.write("   </tr>\n");
      out.write("   <tr>\n");
      out.write("   <td>Chemistry</td>\n");
      out.write("   <td><input type=\"text\" name=\"u4\" placeholder=\"Enter Chemistry\"></td>\n");
      out.write("   </tr>\n");
      out.write("   <tr>\n");
      out.write("   <td>Maths</td>\n");
      out.write("   <td><input type=\"text\" name=\"u5\" placeholder=\"Enter Maths\"></td>\n");
      out.write("   </tr>\n");
      out.write("   <tr>\n");
      out.write("   <th colspan=\"2\"><input type=\"submit\" name=\"form1\"value=\"Insert\" class=\"B\"></th>\n");
      out.write("   </tr> \n");
      out.write("     \n");
      out.write("   </table>\n");
      out.write("   </center>\n");
      out.write("</form>\n");
      out.write("</div> \n");
      out.write("   \n");
      out.write("   ");
 
   String j=request.getParameter("form1");
   
   if(j!=null)
   {
     
    String s1=request.getParameter("u1");
	    String s2=request.getParameter("u2");
		String s3=request.getParameter("u3");
	    String s4=request.getParameter("u4");
		String s5=request.getParameter("u5"); 
       
	   
      
         try
		 {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			String db_url="jdbc:mysql://localhost:3307/onlineexam?useSSL=false&allowPublicKeyRetrieval=true";
			String db_name="root";
			String db_pass="root";
			
			Connection con=DriverManager.getConnection(db_url,db_name,db_pass);
			 
			Statement st= con.createStatement();
			  String q="insert into insmarks values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"');";
			 st.executeUpdate(q); 
                         response.sendRedirect("Insert.jsp?val=Data Inserted Successfully"); 
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
