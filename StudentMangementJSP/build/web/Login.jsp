       <%@page import="java.sql.*" %>

<html> 
<head>
<link rel="stylesheet" href="xyz.css">
<script type="text/javascript">
    
   function demo()
   {
       a=document.getElementById('t1').value;
        if(a.length>=8)
        {
            document.getElementById('sp2').innerHTML="STRONG";
            document.getElementById('sp2').style.color='green'
        }
        else if(a.length>4)
        {
            document.getElementById('sp2').innerHTML="AVERAGE";
            document.getElementById('sp2').style.color='yellow'
        }
        else
        {
            document.getElementById('sp2').innerHTML="WEAK";
            document.getElementById('sp2').style.color='red'
        }
        
        
   }
 

</script>
</head>
<body>  

    <%@include file="nav.jsp" %>
  
<div id="data">
    
<form action="Login.jsp" method="get">

   <center>
       <%
   String b=request.getParameter("s");
   if(b!=null)
   {
   %>
  
   <span style="color:red;font-size:25pt;"> <%= b %></span>
 
   <% } %>
   <table cellpadding="12px">
   
	<caption style="color:white;font-weight:bold;font-size:25px;">Login Page</caption>
   <tr>
   <td>Enter Name</td>
   <td><input type="text" name="un"  placeholder="Enter Name"></td> 
   </tr>
   <tr>
   <td>Enter Password</td>
   <td><input type="password" name="up" id='t1'onkeyup="demo()" placeholder="Enter Password"> </td>
   <th >  <span id="sp2" style="font-size:12px;"></span></th>
   </tr>
   <tr>
   <th colspan="2"><input type="submit" name="form1" value="Login" class="B"></th>
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
   %>
   
</body>
</html>