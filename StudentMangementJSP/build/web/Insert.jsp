
<%@page import="java.sql.*" %>
<html> 
<head>

<link rel="stylesheet" href="xyz.css">
</head>
<body>  
    <%@include file="menunav.jsp" %>
    <% String k=request.getParameter("val");%>
<div id="data">
<form action="Insert.jsp" method="get">

     <center>
         <%
             if(k != null)
             {
          %>
             
	<span style="color:red;"><%= k %></span>
        <%}%>
   <table cellpadding="12px">
   
   <caption style="color:white;font-weight:bold;font-size:25px;">Insert Your Data Here</caption>
   <tr>
   <td>Enter Roll</td>
   <td><input type="text" name="u1" placeholder="Enter Roll">
   </tr>     
   <tr>
   <td>Enter Name</td>
   <td><input type="text" name="u2" placeholder="Enter Name">
   </tr>
   <tr>
   <td>Physics</td>
   <td><input type="text" name="u3" placeholder="Enter Physics"></td>
   </tr>
   <tr>
   <td>Chemistry</td>
   <td><input type="text" name="u4" placeholder="Enter Chemistry"></td>
   </tr>
   <tr>
   <td>Maths</td>
   <td><input type="text" name="u5" placeholder="Enter Maths"></td>
   </tr>
   <tr>
   <th colspan="2"><input type="submit" name="form1"value="Insert" class="B"></th>
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
		 
        

}%>
   
</body>
</html>