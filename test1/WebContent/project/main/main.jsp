<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/w3.css">
<script type="text/javascript" src="/js/jquery-3.4.1.min.js">
</script>
<style type="text/css">
body {

	background-color: skyblue;
}
</style>
<script type="text/javascript" src="/js/jquery-3.4.1.min.js" ></script>
<script type="text/javascript">

$(document).ready(function(){
	$("#btn").click(function() {
		$(location).attr('href', '/main/logout.kkk');
	});
	$('#writelist').click(function(){
		$(location).attr('href','/main/boardlist.kkk');
	});
});


</script>
</head>
<body>
	<div class="container">
      <div class="row">
        <div class="page-header">
          <h1>로그인</h1>
        </div>
      <c:if test="${empty SID}"> 
        <div class="col-md-3">
          <div class="login-box well">
        <form accept-charset="UTF-8" role="form" method="post" action="/main/main.kkk">
            <legend>로그인</legend>
            <div class="form-group">
                <label for="id">아이디</label>
                <input name="id" id="id" placeholder="E-mail or Username" type="text"/>
            </div>
            <div class="form-group">
                <label for="pw">비밀번호</label>
                <input name="pw" id="pw" placeholder="Password" type="password"/>
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-default btn-login-submit btn-block m-t-md" value="Login" />
            </div>
            <span class='text-center'><a href="/bbs/index.php?mid=index&act=dispMemberFindAccount" class="text-sm">비밀번호 찾기</a></span>
            <hr />
            <div class="form-group">
                <a href="/main/join.kkk" class="btn btn-default btn-block m-t-md" >회원가입</a>
            </div>
        </form>
          </div>
        </div>
   </c:if>  
            <div>
            	<button id="btn">로그아웃</button>
            	<button id="writelist">글목록  </button>
            	
            
            </div>
      </div>
    </div>

</body>
</html>