<%@ page import="agileConsulting.simpleMVC.*" errorPage="error.jsp" %>
<html>
<body>
    <%String errore=(String)request.getAttribute("errore") ;
      if(errore!=null) { %>
    		<b><%=errore%></b>
    <%}%>	
	<form method="post" action="SearchController">
	<table>
		<tr>
			<td><b>Deptno</b></td>
			<td><input name="deptno"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="OK" ></td>
		</tr>
	</table>
</form>
</body>
</html>
