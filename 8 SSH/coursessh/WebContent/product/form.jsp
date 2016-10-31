<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>无标题页</title>
<link rel="stylesheet" type="text/css" href="${ctx }/css/index.css"></link>
</head>
<body class="mian_bj">
	<div class="mian_top_01">
		<div class="mian_top_r"></div>
		<div class="mian_top_l"></div>
		<div class="mian_top_c">
			<ul>
				<li><a><p>未完成的任务</p></a></li>
			</ul>
		</div>
		<div class="mian_b">
			<c:if test="${action=='edit' }">
			<form action="${ctx }/product/edit" method="post">
			</c:if>
			<c:if test="${action!='edit' }">
			<form action="${ctx }/product/add" method="post">
			</c:if>
				<input type="hidden" name="productId" value="${pro.productId }" />
				<input type="text" name="name" value="${pro.name }" /><br>
				<input type="text" name="price" value="${pro.price }" /></br>
				<input type="submit" value="新增" />
			</form>
			
		</div>
	</div>
</body>
</html>