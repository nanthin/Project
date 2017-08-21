<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="header.jsp" %>

<html lang="en">
<head>
 
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
   <!--<link rel="stylesheet" type="text/css" href="height.css">-->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

    
<!-- <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
    <c:url value="/resources/images/p.jpg" var="url10"></c:url>
      <a class="navbar-brand" href="#"><img alt="NIIT" src="${url10}" height="30px" width="30px"></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="home">Home</a></li>
      <li><a href="contactus">Contact Us</a></li>
     
      <!-- <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Categories<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Apple</a></li>
          <li><a href="#">Sony</a></li>
          
        </ul>
      </li>
      
      
      <li><a href="https://en.wikipedia.org/wiki/Laptop">About Us</a></li>
    </ul>
    
   
    <ul class="nav navbar-nav navbar-right">
    
    <c:url value="/all/addproduct/viewproduct" var="url4"></c:url>
			<li><a href="${url4 }">Browse All Products</a></li>
    
      <li>
			<c:if test="${pageContext.request.userPrincipal.name!=null }">
			<a href="">Welcome ${pageContext.request.userPrincipal.name }</a>
			</c:if>
			</li>
	
		
	<c:url value="/registrationform" var="url7"></c:url>
    <li><a href="${url7}"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
     
     <c:if test="${pageContext.request.userPrincipal.name==null }">
      <c:url value="/login" var="url8"></c:url>
      <li><a href="${url8}"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </c:if>
      
      <li><security:authorize access="hasRole('ROLE_USER')">
         <li><a href="<c:url value="/cart/getcart"></c:url>">Cart</a></li>
         </security:authorize></li>
      
      
       <c:url value="/j_spring_security_logout" var="logoutUrl"></c:url>
		    <c:if test="${pageContext.request.userPrincipal.name!=null }">
		    <li><a href="${logoutUrl }">logout</a></li>
		    </c:if>
      
      <li><a href="admin">Admin</a></li>
      
     </ul>
  </div>
</nav>-->



<div class="container-fluid">
    
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>

    </ol>

    
    <div class="carousel-inner" role="listbox">
      <div class="item active">
     
      <img class="first-slide home-image" src="resources/images/5.jpg" alt="first slide" style="width:500%">
      <div class="carousel-caption">
          <h3>Laptop</h3>
          <p>OPen Space</p>
        </div>
      </div>

      <div class="item">
        <img class="second-slide home-image" src="resources/images/q.jpg" alt="first slide" style="width:500%">
         <div class="carousel-caption">
          <h3>Apple</h3>
          <p>Laptop</p>
        </div>
      </div>
    
      <div class="item">
    <img class="third-slide home-image" src="resources/images/y.jpg" alt="first slide" style="width:500%">
<div class="carousel-caption">
          <h3>Sony</h3>
          <p>Laptop</p>
        </div>
      </div>

 <div class="item">
        <img class="fourth-slide home-image" src="resources/images/d.jpg" alt="first slide" style="width:500%">
<div class="carousel-caption">
          <h3>Sony</h3>
          <p>Laptop</p>
        </div>
      </div>


    </div>

    
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

<div class="container">
<br><br><br>
<div class="row">

    <div class="col-md-6">
      <div class="Rounded Corners">
       <!--<c:url value="/admin/addproduct/viewproduct" var="url4"></c:url>-->
        <a href="http://www.housebeautiful.com/room-decorating/kitchens/g623/beautiful-designer-kitchens/" target="_blank">
              <h3>Apple</h3>
     <img class="fifth-slide home-image" src="resources/images/i.jpg" alt="first slide" style="width:100%">
         
          
        </a>
      </div>
    </div>

    <div class="col-md-6">
      <div class="Rounded Corners">
        <a href="http://photos.hgtv.com/rooms/viewer/living-space/living-room" target="_blank">
                <h3>Sony</h3>
          <img class="sixth-slide home-image" src="resources/images/d.jpg" alt="first slide" style="width:100%">
          
        </a>
      </div>
    </div>
</div>
</div>    
<%@include file="footer.jsp" %>
 </body>
</html>  
