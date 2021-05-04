
   <%@page import="java.sql.*" %>
<html> 
<head>

<link rel="stylesheet" href="xyz.css">
</head>
<body>  
 <%@include file="menunav.jsp" %>
<div id="data1">
<form action="Search.jsp" method="get">
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
      <center>
   <table cellpadding="12px">
    
   <tr>
   <td>Enter Roll</td>
   <td> <%=re.getString(1)%></td>
   </tr>     
   <tr>
   <td>Enter Name</td>
   <td> <%=re.getString(2)%></td>
   </tr>
   <tr>
   <td>Physics</td>
   <td> <%=re.getString(3)%></td>
   </tr>
   <tr>
   <td>Chemistry</td>
   <td> <%=re.getString(4)%></td>
   </tr>
   <tr>
   <td>Maths</td>
   <td> <%=re.getString(5)%></td>
   </tr> 
     
   </table>
   </center>                    
    
    
    
    <%}
                                con.close();
		 }
         catch(Exception e1)
		 {
			 out.println(e1);
		 }		 
		 
        %>
  

</div>
</body>
</html>