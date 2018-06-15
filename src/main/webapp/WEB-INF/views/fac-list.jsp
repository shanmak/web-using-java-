<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<table>
<tbody>


<fa:forEach var="faclist" items="${faclist}">
<tr>
<td> ${faclist.facilityId}</td>
<td> ${faclist.facilityName}</td>
<td> ${faclist.facilityType}</td>
<td> ${faclist.description}</td>
<td> ${faclist.venue}</td>
<td><img  src="${pageContext.request.contextPath}/image/${faclist.image}"></td>
<td> ${faclist.price}</td>
<td align="center"><a
						href="${pageContext.request.contextPath}/admin/edit/${faclist.facilityId}.html"><spring:message
								code="caption.edit" /></a></td>
					<td><a
						href="${pageContext.request.contextPath}/admin/delete/${faclist.facilityId}.html"><spring:message
								code="caption.delete" /></a></td>
</tr>

</fa:forEach>
</tbody>
</table>
</form>

</body>
</html>