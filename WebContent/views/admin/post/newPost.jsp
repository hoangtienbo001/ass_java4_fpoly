<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Them post</title>
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

				<form method="POST" action="/test1/register/post">

					<div class="mt-3">

						<label for="id_user" class="form-label">id nd</label> <input
							type="text" class="form-control" id="id_user" name="id_user"
							readonly="readonly" value="${ ID_NDHT }" />
					</div>

					<div class="mt-3">

						<label for="title" class="form-label">Title</label> <input
							type="text" class="form-control" id="title" name="title" />

					</div>

					<div class="mt-3">

						<label for="contents" class="form-label">Content</label> <input
							type="text" class="form-control" id="contents" name="contents" />

					</div>

					<div class="mt-3">

						<label for="img" class="form-label">img</label> <input
							type="text" class="form-control" id="img" name="img" />

					</div>

					<div class="mt-3">

						<label for="video" class="form-label">Video</label> <input
							type="text" class="form-control" id="video" name="video" />

					</div>

					<div class="mt-3">

						<label for="state" class="form-label">Status</label> <select
							class="form-select" name="state">

							<option selected value="1">on</option>

							<option value="0">off</option>

						</select>

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