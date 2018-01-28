<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<html>
<head>
    <title>BusStation</title>
    <style media="screen" type="text/css">
        .header-shadow {
            color: #3a839e;
            text-align: center;
            vertical-align: middle;
            font-size: 45pt;
        }

        #content {
          color: #333333;
          font-size: 18pt;
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
        .blogName {
            font-size: 38px;
            color: #FFFFFF;
            background-color: #61D6ED;
            align-content: center;
            text-align: center;
        }
        #menu {
            margin: auto;
            text-align: center;
            align-content: center;
            float: inherit;
        }

        div ul {
            list-style-type: none;
            background-color: aquamarine;
            color: #2BC71A;
            font-size: 16pt;
            font-family: "Fira Code Light";
        }

        body {
            margin: 0 !important;
            padding: 0 !important;
        }

        body div h1 {
            text-align: center;
            color: #abcfff
        }
        .btn {
          font: bold 15px Arial;
          text-decoration: none;
          background-color: #333333;

          padding: 2px 6px 2px 6px;
          border: 1px solid #abcfff;
          border-right-color: #4CAF50;
          border-bottom-color: #333333;
        }
        #addForm {
          text-align: center;
          vertical-align: middle;
          background-color: #3a839e;
          overflow: hidden;
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
    Opinions of our guests
  </div>
  <div id="listOfBlogs" class="topnav">
    <c:forEach items="${blogs}" var="blog">
        <ul id="list">
          <li>User :${blog.userName} writes:<p id="content">${blog.content}</p> Added: ${blog.date}<br>
         </li>
          <li>
            <a class="btn" href="/delete-${blog.id}">Remove</a>
          </li>
            <br>
          <br>
        </ul>
        <br>
    </c:forEach>
      <br>
  </div>
  <div id="addForm">
    <a id="addBtn"  href="/reg"> Share your experience !</a>
  </div>


</div>

</body>


</html>
