
   <%@page import="java.sql.*" %>
<html> 
<head>

<link rel="stylesheet" href="xyz.css">
</head>
<body>  
 <%@include file="menunav.jsp" %>
<div id="data1">
<form action="Update.jsp" method="get">
     <center> 
   <table cellpadding="12px">
   
   <caption style="color:white;font-weight:bold;font-size:25px;">Search Your Data Here</caption>
   <tr>
   <td>Enter Roll</td>
   <td><input type="text" name="u1" placeholder="Enter Roll"></td>
   </tr>     
   
   <tr>
   <th colspan="2"><input type="submit" value="Search" class="B"></th>
   </tr> 
     
   </table>
   </center>
</form>>
</div>
 <div>
     <form action="Update.jsp" method="get">
<center>
   <table cellpadding="12px">
   
<%
    String s1=request.getParameter("u1");
	    
      
         try
		 {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			String db_url="jdbc:mysql://localhost:3307/onlineexam?useSSL=false&allowPublicKeyRetrieval=true";
			String db_name="root";
			String db_pass="root";
			
			Connection con=DriverManager.getConnection(db_url,db_name,db_pass);
			 
			Statement st= con.createStatement();
			  String q="select * from insmarks where URoll='"+s1+"';";
			ResultSet re= st.executeQuery(q);
                        if(re.next())
                        {
                                                 
%> 
    
 
   <tr>
   <td>Enter Roll</td>
   <td><input type="text" name="u1" readonly="true" placeholder="Enter Roll" value=<%=re.getString(1)%>>
   </tr>     
   <tr>
   <td>Enter Name</td>
   <td><input type="text" name="u2" placeholder="Enter Name" value=<%=re.getString(2)%>>
   </tr>
   <tr>
   <td>Physics</td>
   <td><input type="text" name="u3" placeholder="Enter Physics"value=<%=re.getString(3)%>></td>
   </tr>
   <tr>
   <td>Chemistry</td>
   <td><input type="text" name="u4" placeholder="Enter Chemistry"value=<%=re.getString(4)%>></td>
   </tr>
   <tr>
   <td>Maths</td>
   <td><input type="text" name="u5" placeholder="Enter Maths"value=<%=re.getString(5)%>></td>
   </tr>
   <tr>
   <th colspan="2"><input type="submit" name="form1" value="Update" class="B"></th>
   </tr> 
     
                       
    
    
    
    <%}
                                con.close();
		 }
         catch(Exception e1)
		 {
			 out.println(e1);
		 }		 
		 
        %>
  
   </table>
 
   </center>  
  </form>
</div>
        <%
        String j=request.getParameter("form1");
        if(j!=null)
        {

             String sn=request.getParameter("u1");
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
			  String q="update insmarks set UName='"+s2+"',UPhy='"+s3+"',UChem='"+s4+"',UMath='"+s5+"' where URoll='"+sn+"';";
			 st.executeUpdate(q); 
			 response.sendRedirect("ShowAll.jsp"); 
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