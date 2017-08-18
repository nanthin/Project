<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="header.jsp" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <!--<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>-->

<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
     <ul class="nav navbar-nav">
     
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">product<span class="caret"></span></a>
        
        <ul class="dropdown-menu">
        
          
<c:url value="/admin/addproduct" var="url3"></c:url>
  
       <li>
   	<c:if test="${pageContext.request.userPrincipal.name!=null }">
			<security:authorize access="hasRole('ROLE_ADMIN')">
			<a href="${url3 }">Add Product</a>
		    </security:authorize>
			</c:if>
			</li>


<c:url value="/admin/addproduct/viewproduct" var="url4"></c:url>

<li>
   	<c:if test="${pageContext.request.userPrincipal.name!=null }">
			<security:authorize access="hasRole('ROLE_ADMIN')">
			<a href="${url4 }">view Product</a>
		    </security:authorize>
			</c:if>
			</li>

       
      
      
      </ul>
    
    
    </li>
    </ul>
    </div>
    </div>
    </nav>
  </body>
</html> --%>