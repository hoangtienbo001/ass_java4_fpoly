<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Quản lý User</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">

		<div class="container-fluid">

			<a class="navbar-brand" href="#">PT15301-UD</a>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">

				<ul class="navbar-nav me-auto mb-2 mb-lg-0">

					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
				</ul>

				<c:if test="${ empty request.session.user}">
					<a href="/test1/Logout" class="btn btn-default">Logout</a>
				</c:if>

			</div>

		</div>

	</nav>

	<div class="row">
		<div class="col-2 bg-dark" style="padding-top: 10px">
			<div>
				<hr style="color: white;" />
				<ul style="padding: 0">
					<li style="list-style-type: none;"><a href="/test1/admin/user"
						style="text-decoration: none; color: white; margin: 0 0 10px 20px">
							Quản lý User</a></li>
					<hr style="color: white;" />
					<li style="list-style-type: none;"><a href="/test1/admin/post"
						style="text-decoration: none; color: white; margin: 0 0 10px 20px">
							Quản lý Video</a></li>
					<hr style="color: white;" />
				</ul>
			</div>
		</div>

		<div class=col-10>
			<jsp:include page="${ view }" />
		</div>
	</div>

</body>
</html>