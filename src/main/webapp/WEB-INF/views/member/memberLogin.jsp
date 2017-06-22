<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			var path='';
			$(".g").each(function(){
				if($(this).prop("checked")){
					path=$(this).val()+"Login";
				}
			});
			$('#frm').attr('action', path);
			$('#frm').submit();
		});
	});
</script>
</head>
<body>
	<form action="" method="post" id="frm">
		<p><input type="text" name="id"></p>
		<p><input type="password" name="pw"></p>
		<p><input type="radio" class="g" name="grade" value="student" checked="checked"></p>
		<p><input type="radio" class="g" name="grade" value="teacher"></p>
		<input type="button" value="LOGIN" id="btn">
	</form>
</body>
</html>