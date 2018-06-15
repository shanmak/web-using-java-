<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
    <%@  taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"  %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>   
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Facility</title>
</head>
<body>
<h3> New Facility</h3>

<form action="${pageContext.request.contextPath}/new" method="POST"> 

<table>
 <tr>
<td><spring:message code="facility.name"/> </td>
 <td colspan="3"><form:input path="facilityname" size="40"/></td> 
</tr>

<tr>
<td><spring:message code="facility.type"/> </td>
 <td colspan="3"><form:input  path="facilitytype"  size="40"/></td> 
</tr>
<tr>
<td><spring:message code="facility.description"/> </td>
 <td colspan="3"><form:textarea cols="64" rows="5"  path="facilitydescription"  size="40"/></td> 
</tr>

<tr>
<td><spring:message code="facility.venue"/> </td>
 <td colspan="3"><form:input  path="facilityvenue" size="40"/></td>
</tr>

<tr>
<td><spring:message code="facility.image"/> </td>
 <td colspan="3"><form:input path="facilityimage" size="40"/></td> 
</tr>

<tr>
<td><spring:message code="facility.price"/> </td>
 <td colspan="3"><form:input  path="facilityprice"  size="40"/></td> 
</tr>

 <tr>
 <td colspan="2" align="center"> <form:button text="submit" type="submit"/> <form:button text="cancel"/></td> 

</tr>  
</table>

 
</form> 

</body>
</html>