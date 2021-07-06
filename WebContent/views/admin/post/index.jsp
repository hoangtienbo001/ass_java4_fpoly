<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Update post</title>

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
				<form method="POST"
					action="/test1/admin/post/update?id_post=${ post.id_post }">
					<div class="mt-3">
						<label for="id_user" class="form-label">ID_NĐ</label> <input
							type="text" value="${ post.id_user }" class="form-control"
							id="id_user" name="id_user" readonly="readonly" />
					</div>
					<div class="mt-3">
						<label for="title" class="form-label">Title</label> <input
							type="text" value="${ post.title }" class="form-control"
							id="title" name="title" />
					</div>

					<div class="mt-3">
						<label for="contents" class="form-label">contents</label> <input
							type="text" value="${ post.contents }" class="form-control"
							id="contents" name="contents" />
					</div>

					<div class="mt-3">
						<label for="img" class="form-label">img</label> <input
							type="text" value="${ post.img }" class="form-control"
							id="img" name="img" />
					</div>
					<div class="mt-3">
						<label for="video" class="form-label">video</label> <input
							type="text" value="${ post.video }" class="form-control"
							id="video" name="video" />
					</div>
					<div class="mt-3">
						<label for="state" class="form-label">state</label> <select
							class="form-select" name="state">
							<option ${ post.state == 1 ? "selected": "" } value="1">on</option>
							<option ${ post.state == 0 ? "selected": "" } value="0">off</option>
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