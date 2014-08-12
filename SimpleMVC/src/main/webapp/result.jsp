<%@ page import="agileConsulting.simpleMVC.model.*; import java.util.*" errorPage="error.jsp" %>
<head>
<title>Insert title here</title>
</head>
<body>

	<table>
		<thead>
			<tr>
				<th>Emp Name</th>
				<th>Dept Name</th>
			
			</tr>
		</thead>
		<tr>
		<%
		 List<Emp> lista =(List<Emp>) request.getAttribute("lista");  
		 for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
		    Emp emp = (Emp) iterator.next(); %>
			<tr>
			<td><%=emp.getName()%></td>
			<td><%=emp.getDeptName() %></td>
			</tr>
		
		<%}%>	
	
		</tr>
	</table>
</body>
</html>
