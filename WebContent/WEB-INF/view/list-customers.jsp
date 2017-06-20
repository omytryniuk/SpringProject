<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML>
<html>
<head>


<!-- Css -->

<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>
<body>
	List Customers - coming soon....
    <div id="wrapper">
    	<div id="header">
    	 </div>
    	 
    	</div>
    	
    	<input type="button" value="add" onclick="window.location.href='showFormForAdd'; return false" class="add-button"/>
    	 
    	 <table>
    	 
    	 	 <c:forEach var="temp" items="${customers}">
    	 <tr>
    	    <c:url var="updateLink" value="/customer/showFormForUpdate">
         	<c:param name="customerId" value="${temp.id}" />
         </c:url>
    	 
 		 <td> ${temp.firstName} </td>
 		 <td> ${temp.lastName} </td>
         <td> ${temp.email} </td>
         <td> <a href="${updateLink}"> Update </a></td>
      
 		
 
    	 
    	 </tr>
    	 
    	 </c:forEach>
    	 </table>
 


</body>

</html>