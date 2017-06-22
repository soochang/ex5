<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			var path='';
			$(".g").each(function(){
				if($(this).prop("checked")){
					path=$(this).val()+"Join";
				}
			});
			$('#frm').attr('action', path);
			$('#frm').submit();
		});
	});
</script>
</head>
<body>
	<form action="" id="frm" method="post" enctype="multipart/form-data">
		<div>
			STUDENT<input type="radio" class="g" checked="checked" name="grade" value="student">
			TEACHER<input type="radio" class="g" name="grade" value="teacher">
		</div>
		<!-- 공통 입력 -->
		<div>
			<p>ID : <input type="text" name="id"></p>
			<p>PW : <input type="password" name="pw"></p>
			<p>NAME : <input type="text" name="name"></p>
			<p>AGE : <input type="number" name="age"></p>
			<p>FILE : <input type="file" name="f1"></p>
		</div>
		
		<!-- Student -->
		<div>
			<p>PHONE : <input type="number" name="phone"></p>
			<p>TID : <input type="text" name="tid"></p>
		</div>
		
		<!-- Teacher -->
		<div>
			<p>SUBJECT : <input type="text" name="subject"></p>
			<p>HIREDATE : <input type="date" name="hiredate"></p>
		</div>
		
		<input type="button" value="join" id="btn">
	</form>
</body>
</html>