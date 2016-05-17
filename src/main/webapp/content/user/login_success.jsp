<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/templates/include_temp.jsp"%> 
<title>登录成功</title>
</head>
<body>
	登录成功
	<span id="showTime"></span>
	<script type="text/javascript">
		var JUMPTIME = 3;
		function jump(){
			var showTimeDom = document.getElementById("showTime");
			if(JUMPTIME>0){
				$(showTimeDom).text(JUMPTIME+"秒后跳转到首页面");
				JUMPTIME--;
			}else{
				window.location.href="/index";
			}
		}
		$(function(){
			setInterval(function(){jump()},1000);
		});
	</script>
</body>
</html>