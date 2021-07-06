<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>List Video</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
</head>

<body>

	<div class="col-8 offset-2">

		<div class="mt-5 row">

			<div class="col-6">

				<a href="/test1/register/post" class="btn btn-success">Thêm mới</a>

			</div>

			<div class="col-4"></div>

			<div class="col-2 d-flex justify-content-end">

				<select class="form-select">

					<option value="10" selected>10</option>

					<option value="10">20</option>

					<option value="10">50</option>

					<option value="10">100</option>

				</select>

			</div>

		</div>


		<div class="mt-5 table-responsive">

			<table class="table table-striped">

				<thead>

					<tr>

						<td>Id</td>

						<td>ID_UPLOAD</td>

						<td>Title</td>
						
						<td>content</td>
						
						<td>Video</td>

						<td>Status</td>

						<td colspan="2">Action</td>

					</tr>

				</thead>

				<tbody>

					<c:forEach items="${ listPost }" var="video">
						<tr>

							<td>${ video.id_post }</td>

							<td>${ video.id_user }</td>

							<td>${ video.title }</td>
							
							<td>${ video.contents }</td>

							<td><iframe width=240 height="180" 
							src="${ video.video }" 
							title="YouTube video player" 
							frameborder="0" 
							allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" 
							allowfullscreen></iframe>
							</td>

							<td>${ video.state == 1 ? "On" : "Off" }</td>

							<td><a
								href="/test1/admin/post/update?id_post=${ video.id_post }"
								class="btn btn-primary">Update</a></td>

							<td><a
								href="/test1/admin/post/delete?id_post=${ video.id_post}"
								class="btn btn-danger"
								onclick="if (!confirm('Bạn có chắc muốn xóa?')) { return false }">Delete</a></td>

						</tr>
					</c:forEach>

				</tbody>

			</table>

			<ul class="pagination">
				<li class="page-item"><a
					href="/test1/admin/user?page=${ page - 1 }" class="page-link">Previos</a>
				</li>
				<li class="page-item"><a
					href="/test1/admin/user?page=${ page }" class="page-link">${ page }</a>
				</li>
				<li class="page-item"><a
					href="/test1/admin/user?page=${ page + 1 }" class="page-link">Next</a>
				</li>
			</ul>

		</div>

	</div>
</body>
</html>