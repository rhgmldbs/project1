<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 상세보기</title>
<link rel="stylesheet" href="/css/w3.css">
<style>
body {
	background-color: #B1DCF4;
}
</style>
<script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
<script>
	$(document).ready(function() {

		$("#update").click(function() {
			$("#otle").css("display", "none");
			$(".ntle").css("display", "inline-block");
			$("#obody").css("display", "none");
			$(".nbody").css("display", "inline-block");
			$("#save").css("display", "block");
			$("#back").css("display", "block");
		});
		$("#back").click(function() {
			$(location).attr('href', '/main/boardlist.kkk');

		});
		$("#save").click(function() {
			$("#frm").submit();

		});
		$("#delete").click(function() {
			var dle = $('#delete').attr('data-no');
			$(location).attr('href', '/main/delete.kkk?bno='+dle);
		});

	});
</script>


</head>
<body>
	<table class="board_view">
		<colgroup>
			<col width="20%" />
			<col width="35%" />
			<col width="15%" />
			<col width="35%" />
			
		</colgroup>
		<caption style="background-color: white">게시글 상세</caption>
		<tbody>

			<tr>
				<th scope="row">글 번호</th>
				<td>${bno.b_no}</td>

			</tr>

			<tr>
				<th scope="row">작성자</th>
				<td>${bno.b_id }</td>
			</tr>

			<form method="post" action="/main/updateproc.kkk" id="frm">
			
				<input type="hidden" name="bno" value="${bno.b_no}">
				<tr>
					<th scope="row">제목</th>
					<td id="otle" style="background-color: white">${bno.b_tle}</td>




					<td><textarea name="btle" class="ntle"
							style="display: none; width: 200px; height: 70px; background-color: pink; display: none;"
							value="${bno.b_bdy}" /> </textarea></td>

				</tr>

				<tr>
					<td id="obody" style="border: 2px solid white; height: 100px;">${bno.b_bdy}</td>
					<td style="display: none;" class="nbody"><textarea name="bbdy"
							class="nbody"
							style="border: 2px solid pink; display: none; width: 600px; height: 150px;"
							value="${bno.b_bdy}" /> </textarea></td>
				</tr>
			</form>
		</tbody>

	</table>

	<a href="#" class="btn" id="update" style="background-color: blue;">수정하기</a>
 	<a href="#" class="delete" id="delete" data-no="${bno.b_no}" style="background-color: purple;">삭제하기</a>

	<a href="#" class="btn" id="save" style="display: none;">저장하기</a>
	<a href="#" class="btn" id="back" style="display: none;">뒤로가기</a>




</body>
</html>