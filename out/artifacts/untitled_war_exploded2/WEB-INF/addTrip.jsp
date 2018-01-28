<%--
  Created by IntelliJ IDEA.
  User: ggladko97
  Date: 14.05.17
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
    <style type="text/css" media="screen">
        .header-shadow {
            color: #3a839e;
            text-align: center;
            vertical-align: middle;
            font-size: 45pt;
        }
        .topnav {
            background-color: #3a839e;
            overflow: hidden;
        }
        .topnav a {
            float: left;
            display: block;
            color: #f2f2f2;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
            font-size: 17px;
        }
        .topnav a:hover {
            background-color: #ddd;
            color: black;
        }
        .topnav a.active {
            background-color: #4CAF50;
            color: white;
        }
        #menu {
            margin: auto;
            text-align: center;
            align-content: center;
            float: inherit;
        }
    </style>
    <title>Add trip</title>
</head>
<body>
<header id="headd" class="header-shadow">Welcome to our bus station</header>
<div id="menu">
    <div class="topnav" id="myTopnav">
        <a id="home" href="/">Home</a>
        <a id="news" href="/trips/">Trips</a>
        <a href="/trips/addTrip">Propose trip</a>
        <a href="/about">About</a>
    </div>
</div>
</body>
</html>
