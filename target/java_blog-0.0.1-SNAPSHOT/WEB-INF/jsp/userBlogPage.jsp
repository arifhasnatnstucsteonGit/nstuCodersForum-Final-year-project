<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="srping" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<table class="table table-bordered table-hover table-striped">
	
		<thead>
			<tr>
				<th>Title</th>
				<th>Category</th>
				<th>Author</th>
				<th>Descriptions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${userBlog}" var="userBlogs">
						<tr>
							<td><c:out value="${userBlogs.blogTitle}" /></td>
						    <td><c:out value="${userBlogs.blogCategory}" /></td>
							<td><c:out value="${userBlogs.authorName}" /></td>
							<td><c:out value="${userBlogs.blogDescriptions}" />
							   <td><a href="users/remove/${user.id}.html" class="btn btn-danger"> comment</a></td>
							   <button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">reply</button>
							</td>
						</tr>
					</c:forEach>
			
		</tbody>
		
	</table>

 
 