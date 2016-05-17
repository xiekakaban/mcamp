<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/templates/include_temp.jsp"%>
<script src="//cdn.bootcss.com/jqBootstrapValidation/1.3.7/jqBootstrapValidation.js"></script>
<title>注册</title>
</head>
<body>
	<style>
div.panel-body table tr>td {
	padding-bottom: 10px;
}

div.panel-body table tr>td:first-child {
	width: 60%;
}

div.panel-body table tr>td:last-child {
	width: 40%;
	height: 100%;
	text-align: vertical-center;
}
</style>
	<%@ include file="/templates/nav_temp.jsp"%>
	<div id="wrap" class="container-fluid">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">注册</h3>
			</div>
			<div class="panel-body">
				<s:if test="hasActionErrors()">
					<div class="alert alert-danger" role="alert">
						<ul>
						<s:iterator value="actionErrors" var="actionError">
							<li><s:property value="actionError"/></li>
						</s:iterator>
						</ul>
    				</div>
				</s:if>
				<form action="/user/register" method="post">
					<table style="width: 60%; border-right: 1px solid #eeeeee">
						<tr>
							<td><label for="username" class="mgr5">用户名:</label> <input
								type="text" style="display: inline-block; width: 80%"
								class="form-control" id="username" name="user.username" 
								maxlength="20" minlength="6"
								data-validation-minlength-message="请输入用户名{6-20}"
								required data-validation-required-message="请输入用户名{6-20}"/></td>
							<td>sss</td>
						</tr>
						<tr>
							<td><label for="pwd" class="mgr5">密&nbsp;&nbsp;&nbsp;&nbsp;码:</label>
								<input type="password" style="display: inline-block; width: 80%"
								class="form-control" id="pwd" name="user.pwd" /></td>
							<td>ssss</td>
						</tr>
						<tr>
							<td><label for="email" class="mgr5">邮&nbsp;&nbsp;&nbsp;&nbsp;箱:</label>
								<input type="email" style="display: inline-block; width: 80%"
								class="form-control" id="email" name="user.email" /></td>
							<td>sssss</td>
						</tr>
						<tr>
							<td><label for="weichat" class="mgr5">微信号:</label> <input
								type="text" style="display: inline-block; width: 80%"
								class="form-control" id="weichat" name="user.weichat" /></td>
							<td>sssss</td>
						</tr>
						<tr>
							<td>
								<button type="submit" style="float: right; margin-right: 20px;"
									class="btn btn-info">注册</button>
							</td>
							<td></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
</body>
<script>
	$(function() {
		turnNav(4);
	});
</script>
</html>