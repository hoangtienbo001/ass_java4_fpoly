<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Login page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	</nav>
	
	<div class="container">
  <div class="row" style="margin-top: 100px">
   	<div style="border: 1px solid #0dcaf0; max-width: 500px;"; class="col-6">
		<form class="col-6 offset-3 mt-5" method="POST" action="/test1/Login">
			<div class="mb-3">
				<label for="email" class="form-label">Email address</label> <input
					type="email" class="form-control" id="email" name="email" value="huy@gmail.com">
			</div>
			<div class="mb-3">
				<label for="password" class="form-label">Password</label> <input
					type="password" class="form-control" id="password" name="password" value="123">
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div class="col-6">
    <div class="col" style="max-width: 500px ;border: 1px solid #0dcaf0;height: 300px;background-color: #0dcaf0;text-align: center;"></div>
  </div>
</body>
</html>