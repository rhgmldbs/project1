<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="/css/bootstrap.css?after">
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="/js/bootstrap.js"></script>
<script type="text/javascript">
	

	$(document).ready(function() {
		$("#btn").click(function() {
			$(location).attr('href','/main/boardlist.kkk');
		});
	});
	
</script>


<style>
.border-right {
	border-right: 1px solid grey;
}

body {
	background-color: orange;
}
</style>
<script type="text/javascript">
	
</script>
</head>
<body>
	<div class="container">
		<div class="row">
			<form method="post" action="/main/board2proc.kkk">
				<table class="table table-striped"
					style="text-align: center; border: 1px solid #dddddd">
					<thead>
						<tr>
							<th colspan="2"
								style="background-color: red; text-align: center;">게시판 글쓰기
								양식</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="text" class="form-control"
								placeholder="글 제목" name="title" maxlength="50" /></td>
						</tr>
						<tr>
							<td><textarea class="form-control" placeholder="글 내용"
									name="body" maxlength="2048" style="height: 350px;"></textarea></td>
						</tr>
					</tbody>
				</table>
				<input type="submit" id="frn" class="btn btn-primary pull-right"
					value="글쓰기" />


			</form>
			<button id="btn" class="btn btn-primary pull-right">뒤로가기</button>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>

</body>
</html>