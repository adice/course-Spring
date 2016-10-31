<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>无标题页</title>
<link rel="stylesheet" type="text/css" href="${ctx }/css/index.css"></link>
<script type="text/javascript" src="${ctx }/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript">
	function search(){
		var p=$("#searchParam").val();
		window.location.href="${ctx }/product/list?searchParam="+p;
		
		$("[name='pagen']").each(function(key,value){
			$(this).attr("href",$(this).attr("href")+"&searchParam='"+p+"'");
		});
	}
</script>
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
			<div class="mian_b1">
				<p class="mian_b1_sousuo">
					<input id="searchParam" name="" type="text" value="${searchParam }" />
				</p>
				<a href="javascrpt:search()" title="搜索"><p onclick="search()"
						class="mian_b1_a3"></a>
				<p class="mian_b1_list">
					<c:forEach begin="1" end="${page.totalPageNum }" var="pageNum">
						<a name="pagen" href="${ctx }/product/list?pageNum=${pageNum }">${pageNum }</a>
					</c:forEach>
				</p>

			</div>
			<table width="100%" border="0" cellpadding="0" cellspacing="0"
				class="mian_b_bg">
				<tr>
					<td width="10%"><input type="checkbox" name="all" /></td>
					<td width="40%" class="mian_b_bg_lm"><span></span>产品名称</td>
					<td width="10%" class="mian_b_bg_lm"><span></span>产品单价</td>
					<td class="mian_b_bg_lm"><span></span> 操作</td>
				</tr>
				<c:forEach items="${page.list }" var="p">
					<tr>
						<td><input type="checkbox" name="allone" /></td>
						<td>${p.name }</td>
						<td>${p.price }</td>
						<td><a href="${ctx }/product/edit?productId=${p.productId }">修改</a>
						 <a href="${ctx }/product/delete?productId=${p.productId }">删除</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>