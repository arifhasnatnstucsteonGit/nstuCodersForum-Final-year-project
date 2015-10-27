<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="srping" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form commandName="userBlogs" cssClass="form-horizontal userQuestionForm">

	<div class="form-group">
	
	
		<label class="text-primary  col-sm-1 control-label  text-primary">Title</label><br></br>

		
		<div class="col-sm-10">
			<form:input path="BlogTitle" Class="form-control"/>
		</div>
	</div>
	<div class="form-group">
	
	
		<label class="text-primary  col-sm-1 control-label  text-primary">Author: </label><br></br>

		
		<div class="col-sm-10">
			<form:input path="authorName" Class="form-control"/>
		</div>
	</div>
	<div class="form-group">
	
	
		<label class="text-primary  col-sm-1 control-label  text-primary">Category: </label><br></br>

		
		<div class="col-sm-10">
			<form:input path="blogCategory" Class="form-control"/>
		</div>
	</div>
	
	
	<div class="form-group">
		<label class="col-sm-1 control-label text-primary">Details</label><br></br>
		<div class="col-sm-10">
		    <form:textarea path="blogDescriptions" cssClass="form-control"  rows="10"/>
			
		</div>
	</div>
	
	
	<div class="form-group">
		
		<div class="col-sm-10">
			<input type="submit" value="Post" class="btn btn-primary btn-lg btn-block" />
		</div>
	</div>
</form:form>


 
 