<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="srping" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<script src="//tinymce.cachefly.net/4.1/tinymce.min.js"></script>
<script>tinymce.init({selector:'textarea'});</script>


<form:form commandName="tutorials"  cssClass="form-horizontal userQuestionForm">

	<div class="form-group">
        <label class="text-primary  col-sm-1 control-label  text-primary">Title</label><br></br>
        <div class="col-sm-10">
			<form:input path="title" Class="form-control" />
		</div>
	</div>



	<div class="form-group">
		<label for="details" class="col-sm-1 control-label text-primary">Categrory</label><br></br>
		<div class="col-sm-10">
			<form:textarea path="category_name" cssClass="form-control"
				rows="10" />

		</div>
	</div>


	<div class="form-group">
		<label for="details" class="col-sm-1 control-label text-primary">Description</label><br></br>
		<div class="col-sm-10">
			<form:textarea path="descriptions" cssClass="form-control"
				rows="10" />

		</div>
	</div>

	<div class="form-group">

		<div class="col-sm-10">
			<input type="submit" value="Post"
				class="btn btn-primary btn-lg btn-block" />
		</div>
	</div>
</form:form>