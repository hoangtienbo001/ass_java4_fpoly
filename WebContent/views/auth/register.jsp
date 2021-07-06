<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>mano</title>
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
		crossorigin="anonymous">
</head>
<body>

	<div class="row">

		<div class="col-12">

			<div class="col-6 offset-3">

				<form method="POST" action="/test1/RegisterServlet">

					<div class="mt-3">

						<label for="name" class="form-label">Name</label> <input
							type="text" class="form-control" id="name" name="name" />

					</div>

					<div class="mt-3">

						<label for="number" class="form-label">Number</label> <input
							type="number" class="form-control" id="number" name="number" />

					</div>

					<div class="mt-3">

						<label for="email" class="form-label">Email</label> <input
							type="email" class="form-control" id="email" name="email" />

					</div>

					<div class="mt-3">

						<label for="password" class="form-label">Password</label> <input
							type="password" class="form-control" id="password"
							name="password" />

					</div>

					<div class="mt-3">

						<label for="gender" class="form-label">Gender</label> <select
							class="form-select" name="gender">

							<option selected value="1">Male</option>

							<option value="0">Female</option>

						</select>

					</div>

					<div class="mt-3">

						<label for="role" class="form-label">Role</label> <select
							class="form-select" name="role">

							<option selected value="1">User</option>

							<option value="0">Admin</option>

						</select>

					</div>
					
					<div class="mt-3">

						<label for="status" class="form-label">Status</label> <select
							class="form-select" name="status">

							<option selected value="1">on</option>

							<option value="0">off</option>

						</select>

					</div>
					
					<div class="form-check mt-3">

						<input class="form-check-input" type="checkbox" value=""
							id="flexCheckChecked" checked> <label
							class="form-check-label" for="flexCheckChecked"> Receive
							email? </label>

					</div>

					<div class="mt-3">

						<button type="submit" class="btn btn-primary mb-3">

							Submit</button>

					</div>

				</form>

			</div>

		</div>

	</div>


</body>
</html>