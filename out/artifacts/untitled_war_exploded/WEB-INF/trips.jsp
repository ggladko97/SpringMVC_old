<%--
  Created by IntelliJ IDEA.
  User: ggladko97
  Date: 13.05.17
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
    <title>Trips</title>
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
        .tableMain {
            align-content: center;
            font: bold 11px "Trebuchet MS", Verdana, Arial, Helvetica,
            sans-serif;
            color: #6D929B;
            border-right: 1px solid #C1DAD7;
            border-bottom: 1px solid #C1DAD7;
            border-top: 1px solid #C1DAD7;
            letter-spacing: 2px;
            text-transform: uppercase;
            text-align: left;
            padding: 6px 6px 6px 12px;
        }
        td {
            border-right: 1px solid #C1DAD7;
            border-bottom: 1px solid #C1DAD7;
            background: #fff;
            padding: 6px 6px 6px 12px;
            color: #6D929B;
        }
        .btnPropose {
            text-align: center;
            align-content: center;
            display: block;
            width: 115px;
            height: 25px;
            background: #6D929B;
            padding: 10px;
            border-radius: 5px;
            color: white;
            font-weight: bold;
        }

    </style>
</head>
<body>
<div id="main">
    <header id="headd" class="header-shadow">Welcome to our bus station</header>
    <div id="menu">
        <div class="topnav" id="myTopnav">
            <a id="home" href="/">Home</a>
            <a id="news" href="/trips/">Trips</a>
            <a href="/trips/addTrip">Propose trip</a>
            <a href="/about">About</a>
        </div>
    </div>
    <div class="blogName">
        Approved trips are here!
    </div>
    <div align="center">
        <a class="btnPropose" id="addBtn"  href="/trips/addTrip"> Propose your trip !</a><br>
    </div>
    <div align="center">
        <table align="center" class="tableMain">
            <tr class="titles">
                <th>Nr:</th>
                <th>Date:</th>
                <th>From:</th>
                <th>To:</th>
                <th>Bus model:</th>
                <th>Driver:</th>
                <th>Tickets:</th>
            </tr>
            <tr>
                <c:forEach items="${trips}" var="item">
                        <td>${item.id}</td>
                        <td>${item.date}</td>
                        <td>${item.fromC}</td>
                        <td>${item.toC}</td>
                        <td>${item.bus}</td>
                        <td>${item.driver}</td>
                        <td>${item.tickets}</td>
                        <td>
                            <a href="/trips/buy-ticket-${item.id}">Reserve place</a>
                        </td>
                </c:forEach>
            </tr>
        </table>
    </div>




</div>
</body>
</html>
