<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 리스트</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/css/bootstrap.min.css">
<script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#writebtn").click(function() {
		$(location).attr('href','/main/board2Form.kkk');
	});  
	$("#backbtn").click(function() {
		$(location).attr('href','/main/main.kkk');
	});  

	
	$(".tr").click(function(){
		var ttr=$(this).attr('id');
		$(location).attr('href', '/main/seetext.kkk?bno='+ttr);
	
	});	 
	
}); 


</script>
</head>

<style>
body {
  
   background-color : gray;
   padding :60px 10px;
   
     

table {
   border: 1px solid #9C9C9C;
}
</style>
<body>
   <div class="container">
      <div class="row">
    
      <div class="search">
      <!-- <FORM name='frm' method='post' action='/main/search.kkk'> -->
      
      <FORM name='frm' method='post' action='/main/boardlist.kkk'>
      
    <ASIDE style='float: right;'>
      <SELECT name='code'> <!-- 검색 컬럼 -->
        <OPTION value='3001'>내용</OPTION>
        <OPTION value='3002'>작성자</OPTION>
        <OPTION value='3003'>글제목</OPTION>
      </SELECT>
      <input type='text' name='search' placeholder="특수문자는 사용할수 없습니다.">
      <button type='submit'>검색</button>    
    </ASIDE> 
 </FORM>
      </div>
         <table class="table table-striped"
            style="text-align: center; border: 1px solid #dddddd">
            <thead>
               <tr>
                  <th style="background-color: #eeeeee; text-align: center;">번호</th>
                  <th style="background-color: #eeeeee; text-align: center;">작성자</th>
                  <th style="background-color: #eeeeee; text-align: center;">제목</th>
                  <th style="background-color: #eeeeee; text-align: center;">작성일</th>
               </tr>
            </thead>
            <tbody>
            
            <!-- 일반게시글 리스트 -->
            
            
            <c:if test="${not isSearch}"> <!-- 일반 리스트  -->
            <c:forEach var="data" items="${LIST}">            	
               <tr class="tr" id="${data.b_no}" >
                  <td> ${data.b_no} </td>
                  <td> ${data.b_tle}</td>
                  <td> ${data.b_id}</td>
                  <td> 작성일</td>
               </tr>
         
               </c:forEach>
            </c:if>
            <c:if test="${isSearch}">
            <tr class="tr">
            		<td colspan="4">
            			${ keyword }에 대한 검색 결과
            		</td>
            	</tr>
            <c:forEach var="data" items="${LIST}">
            	
               <tr class="tr" id="${data.b_no}" >
                  <td> ${data.b_no} </td>
                  <td> ${data.b_tle}</td>
                  <td> ${data.b_id}</td>
                  <td> 작성일</td>
               </tr>
         
               </c:forEach>
              </c:if>
            </tbody>
         </table>
         <button class="btn btn-primary pull-right" type="button" id="writebtn">글쓰기</button>
         <button class="btn btn-primary pull-left" type="button" id="backbtn">뒤로가기 </button>
         
      </div>
   </div>
</body>
</html>