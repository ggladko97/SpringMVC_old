<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<html>
    <head>
        <title>Registration</title>
        <style media="screen" type="text/css">
            .header-shadow {
                color: #3a839e;
                text-align: center;
                vertical-align: middle;
                font-size: 45pt;
            }
            .bus-main {
                background-size:contain;
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
           #inp {
               background-color: #EAE7E7;
               border: 1px solid #ddd;
               border-radius: 4px;
               box-shadow: 0 0 30px black;
            }
            #sbm {
                background-color: #2BC71A;
                font-size: 22px;
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
        <div class="blogName">
            Opinions of our guests
            <p class="blogText"></p>
            <p>Express your experience...</p>
        </div>

        <div id="inp">
            <form method="post" name="bloger" action="http://localhost:8080/add-blog">

            User Name:         <input name="userName"/><br>
                <%--<form:errors path="userName" />--%>
            Date (YYYY-MM-DD): <input name="date"/><br>
                <%--<form:errors path="date" />--%>
            Content:           <input  name="content"/><br>
                <%--<form:errors path="content" />--%>


            <input type="submit" value="Submit"/><br>
                <a href="/">Back</a>

            </form>
            <form method="POST" action="/uploadFile" enctype="multipart/form-data">
                Upload file <input name="file" type="file">
                <input type="submit" value="Send"/><br>
            </form>
        </div>
    </body>
</html>