<%@page import="java.sql.*" %>
<html> 
<head>

<link rel="stylesheet" href="xyz.css">
</head>
<body>  
 <%@include file="menunav.jsp" %>
<div id="data">
<form action="Delete.jsp" method="get">
    
    <% String k=request.getParameter("val");%>
     <center>
	<%
             if(k != null)
             {
          %>
             
	<span style="color:red;"><%= k %></span>
        <%}%>
   <table cellpadding="12px">
   
   <caption style="color:white;font-weight:bold;font-size:25px;">Delete Your Data Here</caption>
   <tr>
   <td>Enter Roll</td>
   <td><input type="text" name="u1" placeholder="Enter Roll"></td>
   </tr>     
   
   <tr>
   <th colspan="2"><input type="submit" name="form1"value="Delete" class="B"></th>
   </tr> 
     
   </table>
   </center>
</form>
</div>
   
    <%
    String j=request.getParameter("form1");
    
    if(j!=null)
    {
     String s1=request.getParameter("u1");
	    
      
         try
		 {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			String db_url="jdbc:mysql://localhost:3307/onlineexam?useSSL=false&allowPublicKeyRetrieval=true";
			String db_name="root";
			String db_pass="root";
			
			Connection con=DriverManager.getConnection(db_url,db_name,db_pass);
			 
			Statement st= con.createStatement();
			  String q="delete from insmarks where URoll='"+s1+"';";
			 st.executeUpdate(q); 
                         response.sendRedirect("Delete.jsp?val=Data Deleted Successfully"); 
			con.close();
		 }
         catch(Exception e1)
		 {
			 out.println(e1);
		 }		 
		 
   
    
    }
    %>
</body>
</html>