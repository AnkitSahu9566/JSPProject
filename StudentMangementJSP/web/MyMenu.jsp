<html> 
<head>
<link rel="stylesheet" href="xyz.css">
</head>
<body>  
    <%@include file="menunav.jsp" %>
    <hr>
<% String ss=request.getParameter("uname");%>
<div id="data">
<form action="Mymenu" method="get">

      <center>
	
   <table cellpadding="12px" width="300"height="200">
   
	<caption style="color:white;font-weight:bold;font-size:25px;"></caption>
   <tr>
    
   <th colspan="5"> Welcome <%=ss%></th>
   </tr> 
     
   </table>
    </center> 
</form>
</div>
     
   <center>
    <footer>  
        <%@include  file="footer.jsp" %>         
    </footer>
   </center>
      
</body>
</html>