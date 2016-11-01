<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<title>haha</title>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312"></meta>
	<title>产品管理系统</title>
	<link rel="stylesheet" type="text/css" href="${ctx }/css/index.css">
	</link>
	<script type="text/javascript" src="${ctx }/js/jquery-1.7.1.min.js"></script>
	<script type="text/javascript">
		function login(){
			document.loginForm.submit();
		}
		function checkExist(){
			$.get("${ctx }/loginuser/checkname",{'loginName':$('#loginName').val()}, function(data, status) {
				console.log(eval(data)[0].loginName);
			});
		}
	</script>
</head>
<body style="background: #000;">
	<div class="png login_logo">
		<img src="${ctx }/images/logo_03.png" alt="" />
	</div>
	<div class="login">
	<form name="loginForm" action="${ctx }/loginuser/login" method="post">
		<div class="login_1">
			<input id="loginName" name="loginName" type="text" onblur="checkExist()" value="admin" />
		</div>
		<div class="login_2">
			<input name="password" type="password" value="admin" />
		</div>
		<div class="login_4 png">
			<img src="${ctx }/images/login_08.jpg" onclick="login()" />
		</div>
	</form>
	</div>
</body>
</html>
<script src="${ctx }/common.js"></script>