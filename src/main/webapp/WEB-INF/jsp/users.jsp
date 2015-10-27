<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="srping" %>
 
 
 
 
 
 
 
 <table class="table table-bordered table-hover table-striped table-responsive">
  <thead>
  	<tr>
  	
  	 <th>user name</th>
  	  <th>user name</th>
  	</tr>
  
  </thead>
  
  <tbody>
   <c:forEach items="${users}" var="user">
			<tr>
				<td><a href="users/${user.id}.html"> ${user.name} </a></td>
			
				<td><a href="users/remove/${user.id}.html" class="btn btn-danger"> remove </a></td>
			</tr>

		</c:forEach>
  	
  </tbody>
</table>

 
 
 