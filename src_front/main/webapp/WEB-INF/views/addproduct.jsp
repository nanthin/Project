
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<br><br><br>
<div class="container">
<c:url value="/admin/addproduct/saveproduct" var="prod"></c:url>
<form:form action="${prod}" method="post" modelAttribute="product" enctype="multipart/form-data">
<form:hidden path="id"/>
<br><br><br>
<div class="form-group">

 Enter Product Name:
<form:input path="productName" class="form-control"/><br>
<form:errors path="productName" cssStyle="color:red"></form:errors>
</div>
<div class="form-group">
Enter Price Value:

<form:input path="price"  class="form-control"/><br>
<form:errors path="price" cssStyle="color:red"></form:errors>
</div>
<div class="form-group">
Enter Quantity:

<form:input path="quantity" id="quan" class="form-control"/><br>
</div>
<div class="form-group">
Enter Description:

<form:textarea path="description"  id="des" class="form-control"/><br>
<form:errors path="description" cssStyle="color:red"></form:errors>
</div>

<div class="form-group">

Select Category
<c:forEach items="${categories}" var="c">
   <form:radiobutton path="category.id" value="${c.id}"/>${c.categoryName}
</c:forEach>
</div>


<div class="form-group">

  Upload an image 
  <input type="file" name="image">
  </div>
  
  <div class="form-group">
  
  <input type="submit"value="addproduct">
  </div>
  </form:form>
 
 
  </div>
</body>
</html>




