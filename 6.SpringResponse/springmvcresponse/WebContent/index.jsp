<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="JSPController.do">jsp&jstl</a><Br>
	<a href="">i18n<fmt:message key="hi"/></a><br>
	<fmt:formatDate value="<%=new Date() %>" pattern="yyyy-MM-dd"/>
	<br>
	<a href="ExcelController.do">excel</a><br>
	<a href="PDFController.do">PDF</a><br>
	<a href="JSONController.do">JSON</a>
</body>
</html>