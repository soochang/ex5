<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<p><img src="../resources/upload/${member.fileName}"></p>
		<p>NAME : ${member.name}</p>
		<p>GRADE : ${member.grade}</p>
	</div>
	
	<div>
		<p>PHONE : ${student.phone}</p>
		<p>TID : ${student.tid}</p>
	</div>
</body>
</html>