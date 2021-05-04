<%@page import="java.sql.*" %>
<html> 
<head>
<link rel="stylesheet" href="xyz.css">
</head>
<body>  
    <%@include file="menunav.jsp" %>
    <hr>
<center>
    <div id="data">
  <table  cellpadding="12px" width="500">
   
   <caption style="color:white;font-weight:bold;font-size:25px;"> Your Inserted Data Here</caption> 
<% try
  {
	  Class.forName("com.mysql.cj.jdbc.Driver");
			 
	 String db_url="jdbc:mysql://localhost:3307/onlineexam?useSSL=false&allowPublicKeyRetrieval=true";
	 String db_name="root";
	 String db_pass="root";
			
	 Connection con=DriverManager.getConnection(db_url,db_name,db_pass);
			 
	 Statement st= con.createStatement();
	  String q="select * from insmarks;";
	   ResultSet rs=st.executeQuery(q);
			 
				 
	  while(rs.next())
	  {
              
 %>
 
   <tr>
       
<td><%=rs.getString(1)%></td>
<td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getString(5)%></td>
 
    </tr>
   
   
	<%		    
	 } 
	 con.close();
        }
         catch(Exception e1)
        {
	out.println(e1);
        }		 
%>
 
   </table> 
 </center>  
</div>
</body>
</html>



		