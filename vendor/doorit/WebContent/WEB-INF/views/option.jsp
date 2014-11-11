<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Option Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Add a Option
</h1>


<c:url var="addAction" value="/addOption/${question1}" ></c:url>

<form:form action="${addAction}" commandName="option">
<table>
	
	<tr>
		<td>
			<form:label path="optId">
				<spring:message text="optId"/>
			</form:label>
		</td>
		<td>
			<form:input path="optId" readonly="true" size="8"  disabled="true" />
			<form:hidden path="optId" />
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label path="optDesc">
				<spring:message text="optDesc"/>
			</form:label>
		</td>
		<td>
			<form:input path="optDesc" />
		</td> 
	</tr>
	<tr>
		<td colspan="2">
			
				<input type="submit"
					value="<spring:message text="Add Option"/>" />
			
		</td>
	</tr>
	 
</table>	
</form:form>

<h3>Option List</h3>
<c:if test="${!empty listOption}">
	<table class="tg">
	<tr>
		<th width="80">Question ID</th>
		<th width="80">Opt ID</th>
		<th width="120">Opt Desc</th>
		
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listOption}" var="option">
		<tr>
			<td>${option.question.queId}</td>
			<td>${option.optId}</td>
			<td>${option.optDesc}</td>
			<td><a href="<c:url value='/deleteOption/${option.optId}' />" >Delete Option</a></td>
			
		</tr>
	</c:forEach>
	</table>
</c:if>



</body>
</html>
