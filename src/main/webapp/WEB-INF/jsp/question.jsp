<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="srping" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

dfgdfgdfgdfgdfgdfgdf
<table class="table table-bordered table-hover table-striped">
	
		<thead>
			<tr>
				<th>Title</th>
				<th>Link</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${questions}" var="tu">
						<tr>
							<td><c:out value="${tu.cat_title}" /></td>
						
							<td><c:out value="${tu.cat_description}" /></td>
						</tr>
					</c:forEach>
			
		</tbody>
		
	</table>
 ${questions.ques_id}
 
 