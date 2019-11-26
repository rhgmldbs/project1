<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/w3.css">
<script type="text/javascript" src="/js/jquery-3.4.1.min.js">
</script>
<style>
body{

background-color: lightpink;

}
</style>
<script type="text/javascript">
</script>
</head>
<body>

<form method ="post" action="/main/joinproc.kkk" >
         <div>
         <h1>회원 가입 </h1>
            <label for="id">아이디:</label> <input id="id" name="id" type="text">
         </div>
         <div>
            <label for="id">비밀번호:</label> <input id="pw" name="pw" type="password">
         </div>
         <div>
            <label for="id">이름:</label> <input id="name" name="name" type="text">
        
        <div>
          <label for="id">이메일 : </label> <input id="mail" name="mail" type="text">
        </div>
        <div>
          <label for="id">전화번호
          :</label> <input id="tell" name="tell" type="text">
        </div>
         </div>
         <fieldset>
            <legend>성별</legend>
            남성 <input type="radio" name="gender" value="M"/>
            여성 <input type="radio" name="gender" value="F"/>
         </fieldset>
         <div>
         <input type ="submit" name="button" value="회원가입"> 
         <input type ="reset" name="button" value="취소"> 
         
      	</div>
      </form>
   

</body>
</html>