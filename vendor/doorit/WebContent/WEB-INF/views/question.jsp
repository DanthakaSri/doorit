<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Questions Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Add a Questions
</h1>


<c:url var="addAction" value="/addQuestion/${product1}" ></c:url>

<form:form action="${addAction}" commandName="question">
<table>
	
	<tr>
		<td>
			<form:label path="queId">
				<spring:message text="queId"/>
			</form:label>
		</td>
		<td>
			<form:input path="queId" readonly="true" size="8"  disabled="true" />
			<form:hidden path="queId" />
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label path="queDesc">
				<spring:message text="queDesc"/>
			</form:label>
		</td>
		<td>
			<form:input path="queDesc" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="queType">
				<spring:message text="queType"/>
			</form:label>
		</td>
		<td>
			<form:input path="queType" />
		</td>
	</tr>
	
	<tr>
		<td colspan="2">
			<c:if test="${empty question.queDesc}">
				<input type="submit"
					value="<spring:message text="Add Question"/>" />
			</c:if>
		</td>
	</tr>
	 
</table>	
</form:form>

<h3>Questtion List</h3>
<c:if test="${!empty listQuestion}">
	<table class="tg">
	<tr>
		<th width="80">Product ID</th>
		<th width="80">Que ID</th>
		<th width="120">Que Desc</th>
		<th width="120">Que Type</th>
		<th width="60">Edit</th>
	</tr>
	<c:forEach items="${listQuestion}" var="question">
		<tr>
			<td>${question.product.productId}</td>
			<td>${question.queId}</td>
			<td>${question.queDesc}</td>
			<td>${question.queType}</td>
			<td><a href="<c:url value='/addOption/${question.queId}' />" >Add Option</a></td>
			
		</tr>
	</c:forEach>
	</table>
</c:if>



</body>
</html>
