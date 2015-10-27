<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="srping" %>
 
 <h1 > ${user.name} </h1>
       ${user.blogs}
       ${user.id}
       ${user.email}
  
       



<c:forEach items="${user.blogs }" var="blog">

	<h2>${blog.name}</h2>
	<p>${blog.url}</p>

	<table class="table table-bordered table-hover table-striped">
	
		<thead>
			<tr>
				<th>Title</th>
				<th>Link</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${blog.items}" var="item">
						<tr>
							<td><c:out value="${item.title}" /></td>
							<td><c:out value="${item.link}" /></td>
						</tr>
					</c:forEach>
			
		</tbody>
		
	</table>




<td>${item.title}</td>


</c:forEach>