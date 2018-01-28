<%--
  Created by IntelliJ IDEA.
  User: ggladko97
  Date: 14.05.17
  Time: 12:32
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
    <title>Reserve ticket</title>
    <style media="screen" type="text/css">
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
        .blogName {
            font-size: 38px;
            color: #FFFFFF;
            background-color: #61D6ED;
            align-content: center;
            text-align: center;
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
</head>
<body>
    <div>
        <header id="headd" class="header-shadow">Welcome to our bus station</header>
        <div id="menu">
            <div class="topnav" id="myTopnav">
                <a id="home" href="/">Home</a>
                <a id="news" href="/trips/">Trips</a>
                <a href="/trips/addTrip">Propose trip</a>
                <a href="/about">About</a>
            </div>
        </div>
    </div>
    <div align="center">
        <form method="post" name="ticket" action="http://localhost:8080/trips/buy-page">
            <p>Buy ticket for trip #${tripId}</p>
            <label for="userName">First Name</label>
            <input id="userName" name="firstName"/><br>
            <label for="email">Email</label>
            <input id="email" name="email"/><br>
            <label for="phone">Phone </label>
            <input id="phone" name="phone"/><br>
            <input type="submit" value="Submit"/>
        </form>
    </div>
</body>
</html>
