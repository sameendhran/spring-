<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Job Post List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-warning">
    <div class="container">
        <a class="navbar-brand fs-1 fw-medium" href="#">SAM Job Portal Web App</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link" href="home">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="viewalljobs">All Jobs</a></li>
                <li class="nav-item"><a class="nav-link" href="https://telusko.com/">Contact</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <h2 class="mb-4 text-center font-weight-bold">Job Post List</h2>

    <div class="row row-cols-2">
        <c:forEach var="jobPost" items="${jobPosts}">
            <div class="col mb-4">
                <div class="card border-dark bg-dark text-white">
                    <div class="card-body">
                        <h5 class="card-title">${jobPost.postProfile}</h5>
                        <p class="card-text">
                            <strong>Job-Id: </strong>${jobPost.postId}
                        </p>
                        <p class="card-text">
                            <strong>Description:</strong> ${jobPost.postDesc}
                        </p>
                        <p class="card-text">
                            <strong>Experience Required:</strong> ${jobPost.reqExperience} years
                        </p>
                        <p class="card-text">
                            <strong>Tech Stack Required:</strong>
                            <ul>
                                <c:forEach var="tech" items="${jobPost.postTechStack}">
                                    <li>${tech}</li>
                                </c:forEach>
                            </ul>
                        </p>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>