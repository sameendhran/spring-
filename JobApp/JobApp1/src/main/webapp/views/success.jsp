<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Job Post Details</title>
    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
        rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
        crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container">
        <a class="navbar-brand" href="#">SAM Job Portal Web App</a>
    </div>
</nav>


<div class="container mt-5">
    <c:choose>
        <c:when test="${not empty jobPost}">
            <h2 class="mb-4 text-center fw-bold">Job Post Details</h2>
            <div class="row justify-content-center">
                <div class="col-md-6">
                    <div class="card border-dark bg-dark text-white">
                        <div class="card-body">
                            <h5 class="card-title">${jobPost.postProfile}</h5>
                            <p><strong>Job-Id:</strong> ${jobPost.postId}</p>
                            <p><strong>Description:</strong> ${jobPost.postDesc}</p>
                            <p><strong>Experience Required:</strong> ${jobPost.reqExperience} years</p>
                            <p><strong>Tech Stack Required:</strong></p>
                            <ul>
                                <c:forEach var="tech" items="${jobPost.postTechStack}">
                                    <li>${tech}</li>
                                </c:forEach>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </c:when>
        <c:otherwise>
            <h2 class="text-center text-danger">No Job Post Details Available</h2>
        </c:otherwise>
    </c:choose>
</div>

<script
    src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
    crossorigin="anonymous"></script>
</body>
</html>
