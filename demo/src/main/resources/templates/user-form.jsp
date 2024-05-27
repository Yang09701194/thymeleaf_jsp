<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" --%>    
    
<%@ taglib prefix="c" uri="jakarta.tags.core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Management Application</title>
<link rel="stylesheet" href="./bootstrap-4.3.1-dist/css/bootstrap.min.css">
</head>
<body>

	<!--     header.jsp     -->
<%-- 	<jsp:include page="header.jsp"></jsp:include> --%>
		
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${user != null}">
					<form action="<%=request.getContextPath()%>/user?action=update" method="post">
				</c:if>
				<c:if test="${user == null}">
					<form action="<%=request.getContextPath()%>/user?action=insert" method="post">
				</c:if>
			
		
				<caption>
					<h2>
						<c:if test="${user != null}">
							Edit User
						</c:if>
						<c:if test="${user == null}">
							Add New User
						</c:if>
					</h2>
				</caption>
				
				<c:if test="${user != null}">
					<input type="hidden" name="id" value='<c:out value="${user.id}"></c:out>'>
				</c:if>
				
				<fieldset class="form-group">
					<label>User Name</label> <input type="text" value='<c:out value="${user.name}" />' class="form-control" name="name" required="required">
				</fieldset>
				<fieldset class="form-group">
					<label>User Email</label> <input type="text" value='<c:out value="${user.email}" />' class="form-control" name="email">
				</fieldset>
				<fieldset class="form-group">
					<label>User Country</label> <input type="text" value='<c:out value="${user.country}" />' class="form-control" name="country">
				</fieldset>
				
				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
	


</body>
</html>