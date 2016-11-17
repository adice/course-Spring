<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="user/createUser.do">
		<input type="text" name="userName"><br>
		<input type="password" name="userPwd"><br>
		<input type="radio" name="userSex" value="男">男
		<input type="radio" name="userSex" value="女">女
		<br>
		<input type="submit" value="regist">
	</form>
	<br>
	请求映射控制器<br>
	1<a href="user/a/mapping.do">带通配符url映射</a><br>
	2<a href="user/zs.do">带占位符url映射</a><br>
	3<a href="user.do">根据请求方法映射</a><br>
	4<a href="user.do?userId=3">根据请求参数映射</a><br>
	5<a href="user/baowentou.do">根据报文头映射(失败)</a><br>
	===========================================================<br>
	6<a href="user/hi1.do?username=zs&userage=18">请求的参数绑定到方法参数</a><br>
	7<a href="user/hi2.do">将cookie值和报文头属性绑定到方法参数</a><br>
	8绑定对象
	<form action="user/hi3.do">
		<input type="text" name="userName"><br>
		<input type="password" name="userPwd"><br>
		<input type="radio" name="userSex" value="男">男
		<input type="radio" name="userSex" value="女">女
		<br>
		<input type="submit" value="regist">
	</form>
	9<a href="user/hi4.do">将请求reques绑定方法参数</a>
	
</body>
</html>