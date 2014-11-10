<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONT AWESOME STYLE  -->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- CUSTOM STYLE  -->
    <link href="assets/css/style.css" rel="stylesheet" />
    <!-- GOOGLE FONT -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>

    <!-- LOGO HEADER END-->
     <section class="menu-section">
        <div class="container">
            <div class="row ">
			<div class="col-md-3">
				  <a  href="index.html">
					   <img  height="60" src="assets/img/dooritlogo.png" />
                </a>

			</div>
                <div class="col-md-9">


                    <div class="navbar-collapse collapse ">
									                 
                        <ul id="menu-top" class="nav navbar-nav navbar-right">
                            <li><a href="howitworks.html" class="menu-top-active">How It Works</a></li>
                           
                            <li><a href="serviceSearch.html">Request Service</a></li>
                            <li><a href="VendorRegistration.html">List your business</a></li>
                            <li><a href="login.html" >Login</a></li>
                            

                        </ul>
                    </div>
                </div>

            </div>
        </div>
		<div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
              
            </div>
    </section>
     <!-- MENU SECTION END-->
    <div class="content-wrapper">
         <div class="container">
        <div class="row pad-botm">
            <div class="col-md-12">
                <h4 class="header-line">Sign Up Your Business</h4>
                
                            </div>

        </div>
             <div class="row">
            <div class="col-md-6 col-sm-6 col-xs-12">
               <div class="panel panel-info">
                        <div class="panel-heading">
                           Find customers in your area 
                        </div>
                        <c:url var="addvendor" value="/vendoradd" ></c:url>
                        <div class="panel-body">
                           
                            <form:form method="post" action="/user.jsp" modelAttribute="vendor">
										<div class="form-group">
                                            <label>1. Set-up your account details</label>                                   
                                        </div>
										<hr/>
                                        <div class="form-group">
                                            <label>Company Name * </label>
                                            <form:input path="companyName" class="form-control" type="text" required/>
                                                                                   
                                        </div>
										<div class="form-group">
                                            <label>Your name * </label>
                                             <form:input path="companyName" class="form-control" type="text" required/>
                                            <input class="form-control" type="text" required/>                                           
                                        </div>
										<div class="form-group">
                                            <label>Phone Number * </label>
                                             <form:input path="name" class="form-control" type="text" required/>
                                                                             
                                        </div>
										<div class="form-group">
                                            <label>Your Email *</label>
                                              <form:input path="phoneNumber" class="form-control" type="text" required/>
										<div class="form-group">
                                            <label>City *</label>
                                            <input class="form-control" type="text" required/>
                                        </div>
										<div class="form-group">
                                            <label>Location *</label>
                                            <input class="form-control" type="text" required/>
                                        </div>
										<div class="form-group">
                                            <label>2. Enter your company details</label>
                                        </div>
										<hr/>
                                            <div class="form-group">
                                            <label>Your comments</label>
                                            <textarea class="form-control" rows="3"></textarea>
                                        </div>
										</div>
                                            <div class="form-group">
                                            <label>Services Offered by your company</label>                                  
                                        </div>
										<div class="col-md-4">
										<input type="checkbox">Plumbing</input>
										</div>
										<div class="col-md-4">
										<input type="checkbox">Electrician</input>
										</div>
										<div class="col-md-4">
										<input type="checkbox">Carpentry</input>
										</div>
										<div class="col-md-4">
										<input type="checkbox">Pest control</input>
										</div>
										<div class="col-md-4">
										<input type="checkbox">Flooring</input>
										</div>
										<div class="col-md-4">
										<input type="checkbox">Painting</input>
										</div>
									
										</div>
                                            <div class="form-group">
                                            <label></label>                                  
                                        </div>
										<center> <button type="submit" class="btn btn-info"><a href="VendorDashborad.html">SUBMIT<a></button>
										</center>
								</form:form>									
										</div>
                                            <div class="form-group">
                                            <center><label>* Fields are mandatory</label>  </center>                                
                                        </div>

                                    
                            </div>
							<div class="col-md-6">
							content goes here
							</div>
                        </div>
                            </div>
        </div>
             <!--/.ROW-->

    </div>
    </div>
     <!-- CONTENT-WRAPPER SECTION END-->
    <section class="footer-section">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                   &copy; 2014 Yourdomain.com |<a href="http://www.binarytheme.com/" target="_blank"  > Designed by : binarytheme.com</a> 
                </div>

            </div>
        </div>
    </section>
      <!-- FOOTER SECTION END-->
    <!-- JAVASCRIPT FILES PLACED AT THE BOTTOM TO REDUCE THE LOADING TIME  -->
    <!-- CORE JQUERY  -->
    <script src="assets/js/jquery-1.10.2.js"></script>
    <!-- BOOTSTRAP SCRIPTS  -->
    <script src="assets/js/bootstrap.js"></script>
      <!-- CUSTOM SCRIPTS  -->
    <script src="assets/js/custom.js"></script>
</body>
</body>
</html>