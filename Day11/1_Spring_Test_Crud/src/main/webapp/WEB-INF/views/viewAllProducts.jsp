<%@page import="com.spring.Entity.Product"%>
<%@ page import="java.util.*,com.spring.Entity.*"%>

<html>
<body>
	<h2>All Products</h2>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Category</th>
			<th>Description</th>
		</tr>

		<%
		List<Product> list = (List<Product>) request.getAttribute("products");
		for (Product p : list) {
		%>
		<tr>
			<td><%=p.getId()%></td>
			<td><%=p.getProductName()%></td>
			<td><%=p.getProductCategory()%></td>
			<td><%=p.getProductDescription()%></td>
		</tr>
		<%
		}
		%>

	</table>
	<a href="/">Home</a>
</body>
</html>
