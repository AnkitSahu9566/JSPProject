
<%@page import="java.sql.*" %> 
<html> 
<head>
<link rel="stylesheet" href="xyz.css">
<script type="text/javascript" src="abc.js">
</script>
</head>
<body>  
    <%@include  file="nav.jsp" %>  

<div id="data">
    <form action="Regis.jsp" onsubmit="return demo()" method="get">

    <center>
	
   <table cellpadding="12px">
   
	<caption style="color:white;font-weight:bold;font-size:25px;">Registration Page</caption>
   <tr>
   <td>Enter Name</td>
   <td><input type="text" name="un" id="a"  placeholder="Enter Name"></td>
   </tr>
   <tr>
   <td>Enter Password</td>
   <td><input type="password" name="up" id="b" placeholder="Enter Password"></td>
   </tr>  
   <tr>
   <td>Enter Email</td>
   <td><input type="email" name="email" id="c" placeholder="Enter Email"></td>
   </tr>
   <tr>
   <td>Enter DOB</td>
   <td><input type="date" name="date1" placeholder="dd-mm-yy"></td>
   </tr>    
   <tr>
   <td>Gender</td>
   <td><input type="radio" name="gender" value="Male">Male<input type="radio" name="gender" value="Female">Female</td>
   </tr> 
   <tr>
   <td>Contact Number</td>
   <td><input type="text" name="num" id="d" placeholder="Phone Number"></td>
   </tr> 
   <tr>
   <th colspan="2"><input type="submit" name="form1" value="Registration" class="B"></th>
   </tr> 
     
   </table>
    </center>
</form>
</div>
    
    <%
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
    %>
</body>
</html>