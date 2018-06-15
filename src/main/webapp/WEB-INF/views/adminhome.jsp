<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <link href="admin.css" rel="stylesheet">
</head>
<body >

<form action="">
<div class="nav-side-menu">
    <div class="brand"><a class="navbar-brand js-scroll-trigger" href="#"><img src = "images/t7logo.svg" width=50px>T7ClubHouse</a></div>
    <i class="fa fa-bars fa-2x toggle-btn" data-toggle="collapse" data-target="#menu-content"></i>
  
        <div class="menu-list">
  
            <ul id="menu-content" class="menu-content collapse out">
                <li>
                  <a href="#"><i class="fa fa-home fa-lg fa-fw sidebar-icon"></i> Dashboard</a>
                </li>
                
               <li  data-toggle="collapse" data-target="#managebooking" class="collapsed">
                    <a href="#"><i class="fa fa-calendar fa-lg fa-fw sidebar-icon"></i> Manage Bookings<span class="arrow"></span></a>
                </li>
                <ul class="sub-menu collapse" id="managebooking">
                    <li><a href="#"><i class="fa fa-angle-double-right"></i> View Bookings</a></li>
                    <li><a href="#"><i class="fa fa-angle-double-right"></i> Create New </a></li>
                    <li><a href="#"><i class="fa fa-angle-double-right"></i> Modify/Delete</a></li>
                </ul>
                
                <li>
                  <a href="#"><i class="fa fa-wrench fa-lg fa-fw sidebar-icon"></i> Maintenance</a>
                </li>
                
<!--
                <li>
                  <a href="#"><i class="fa fa-bar-chart fa-lg fa-fw sidebar-icon"></i> Statistics</a>
                </li>
-->
                
                <li  data-toggle="collapse" data-target="#managefacility" class="collapsed">
                    <a href="#"><i class="fa fa-life-ring fa-lg fa-fw sidebar-icon"></i> Manage Facility<span class="arrow"></span></a>
                </li>
                <ul class="sub-menu collapse" id="managefacility">
                    <li><a href="#"><i class="fa fa-angle-double-right"></i> View Facilities</a></li>
                    <li><a href="#"><i class="fa fa-angle-double-right"></i> Create New </a></li>
                    <li><a href="#"><i class="fa fa-angle-double-right"></i> Modify/Delete</a></li>
                </ul>
                
                <li  data-toggle="collapse" data-target="#managemembers" class="collapsed">
                    <a href="#"><i class="fa fa-user fa-lg fa-fw sidebar-icon"></i> Manage Members<span class="arrow"></span></a>
                </li>
                <ul class="sub-menu collapse" id="managemembers">
                    <li><a href="#"><i class="fa fa-angle-double-right"></i> View Members</a></li>
                    <li><a href="#"><i class="fa fa-angle-double-right"></i> Create New </a></li>
                    <li><a href="#"><i class="fa fa-angle-double-right"></i> Modify/Delete</a></li>
                </ul>

                <il class="sub-menu collapse" id="settings">
                    <li><a href="#"><i class="fa fa-angle-double-right"></i> General</a></li>
                    <li><a href="#"><i class="fa fa-angle-double-right"></i> Security</a></li>
                    <li><a href="#"><i class="fa fa-angle-double-right"></i> Notifications</a></li>
                </ul>
                
<
                

            </ul>
     </div>
</div>

<div class="main">
    <h5>WELCOME, ADMIN!</h5>
</div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
</form>
</body>
</html>