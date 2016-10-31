<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
	<title>世尊家具综合管理系统</title> <script>
		function fixpng24() {
			var arVersion = navigator.appVersion.split("MSIE");
			var version = parseFloat(arVersion[1]);
			if ((version >= 5.5) && (document.body.filters)) {
				for (var i = 0; i < document.images.length; i++) {
					var img = document.images[i];
					if (img.src.toLowerCase().slice(-3) == "png") {
						var imgID = (img.id) ? "id='" + img.id + "' " : "";
						var imgClass = (img.className) ? "class='"
								+ img.className + "' " : "";
						var imgTitle = (img.title) ? "title='" + img.title
								+ "' " : "title='" + img.alt + "' ";
						var imgStyle = "display:inline-block;"
								+ img.style.cssText;
						if (img.align == "left")
							imgStyle = "float:left;" + imgStyle;
						if (img.align == "right")
							imgStyle = "float:right;" + imgStyle;
						if (img.parentElement.href)
							imgStyle = "cursor:pointer;" + imgStyle;
						var strNewHTML = "<span "
								+ imgID
								+ imgClass
								+ imgTitle
								+ " style=\"width:"
								+ img.width
								+ "px; height:"
								+ img.height
								+ "px;"
								+ imgStyle
								+ "filter:progid:DXImageTransform.Microsoft.AlphaImageLoader"
								+ "(src='" + img.src
								+ "', sizingMethod='scale');\"></span>";
						img.outerHTML = strNewHTML;
						i--;
					}
				}
			}
		}
	</script>
	<link rel="stylesheet" type="text/css" href="${ctx }/css/index.css">
</head>
<body class="index-xbj">
	<div class="logo_index png">
		<img src="${ctx }/images/logo_03.png">
	</div>
	<div style="clear: both;"></div>
	<div class="content_001">
		<div class="content_001_r">
			<div class="title_01 png">
				<img src="${ctx }/images/tt_11.png" alt="">
			</div>
			<div class="index_icon png">
				<img src="${ctx }/images/icon_05.png" alt=""> <img
					src="${ctx }/images/icon_07.png" alt=""> <img
						src="${ctx }/images/icon_18.png" alt=""> <img
							src="${ctx }/images/icon_19.png" alt=""> <img
								src="${ctx }/images/icon_26.png" alt=""> <img
									src="${ctx }/images/icon_27.png" alt="">
			</div>
		</div>
		<div class="content_001_l">
			<div class="title_01 png">
				<img src="${ctx }/images/tt_07.png" alt="">
			</div>
			<div class="index_Time">
				<dl>
					<dt>
						10:35<span>AM</span>
					</dt>
					<dd>2012-03-08 星期四</dd>
				</dl>
			</div>
			<div class="index_l1_t">任务提醒</div>
			<div class="index_l1_b">
				<dl>
					<dt>您当前有0条未完成任务，请注意！</dt>
					<dd>
						0
						<dd></dd>
					</dd>
				</dl>
			</div>
			<div class="index_l2">
				<dl>
					<dt class="png">
						<img src="${ctx }/images/index_lm2_36.png">
					</dt>
					<dd>
						<img src="${ctx }/images/pic_03.jpg" alt="">
							<div>
								<span>联想扬天</span>：4000年前，华夏先民就开始以“春分竖蛋”庆贺春天的来临，“春分到...
							</div>
					</dd>
					<dd>
						<img src="${ctx }/images/pic_03.jpg" alt="">
							<div>
								<span>联想扬天</span>：4000年前，华夏先民就开始以“春分竖蛋”庆贺春天的来临，“春分到...
							</div>
					</dd>
					<dd>
						<img src="${ctx }/images/pic_03.jpg" alt="">
							<div>
								<span>联想扬天</span>：4000年前，华夏先民就开始以“春分竖蛋”庆贺春天的来临，“春分到...
							</div>
					</dd>
				</dl>
			</div>
		</div>
		<div class="content_001_l1">
			<div class="title_01 png"><a href="gonggao/add"></a>
				<img src="${ctx }/images/tt_09.png" alt="" />
			</div>
			<div class="index_icon png">
				<a href="${ctx }/product/main.jsp"><img src="${ctx }/images/icon_10.png" alt="" /></a>
				<img src="${ctx }/images/icon_03.png" alt="" />
				<img src="${ctx }/images/icon_16.png" alt="" />
				<img src="${ctx }/images/icon_17.png" alt="" />
				<img src="${ctx }/images/icon_24.png" alt="" />
				<img src="${ctx }/images/icon_25.png" alt="" />
				<img src="${ctx }/images/icon_32.png" alt="" />
				<img src="${ctx }/images/icon_33.png" alt="" />
			</div>
		</div>
	</div>
</body>
</html>