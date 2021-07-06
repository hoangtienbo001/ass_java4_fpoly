<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chu</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<script href=".//help.js" type="text/javascript"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light "
		style="background-color: #e3f2fd">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Share Study File</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="/test1/showVideo">Trang
							chu</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/websof3011/admin/qlvideo"></a></li>
					<li class="nav-item"><a class="nav-link" href="/test1/Logout">logout</a></li>
				</ul>
				<form class="d-flex">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
				</form>
			</div>
		</div>
	</nav>

	<section class="row">
		<article class="col-12" >
			<div class="card float-lef m-3" >
				<div>
					<c:forEach items="${ listPost }" var="video">
							<iframe width="320" height="240" src="${ video.video }"
								title="YouTube video player" frameborder="0"
								allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
								allowfullscreen> </iframe>
					</c:forEach>
				</div>
			</div>
		</article>
	</section>

	<ul class="pagination">
		<li class="page-item"><a
			href="/test1/admin/user?page=${ page - 1 }" class="page-link">Previos</a>
		</li>
		<li class="page-item"><a href="/test1/admin/user?page=${ page }"
			class="page-link">${ page }</a></li>
		<li class="page-item"><a
			href="/test1/admin/user?page=${ page + 1 }" class="page-link">Next</a>
		</li>
	</ul>

</body>
</html>