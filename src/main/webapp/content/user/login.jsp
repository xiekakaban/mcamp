<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/templates/include_temp.jsp"%>
<title>登录</title>
<style>
div.login_left, div.login_right {
	display: inline-block;
	float: left;
}

div.left_content {
	border-right: 1px solid #eeeeee;
}

div.right_content {
	
}
</style>
</head>
<body>
	<%@ include file="/templates/nav_temp.jsp"%>
	<div id="wrap" class="container-fluid">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">登录</h3>
			</div>
			<div class="panel-body">
				<div class="container-fluid">
					<div class="row">
						<div class="left_content col-md-7">
							<form action="/user/login" method="POST">
								<div class="form-group">
									<label for="username" class="mgr5">用户名:</label> <input
										type="text" style="display: inline-block; width: 50%;"
										class="form-control" id="username" name="user.username" />
								</div>
								<div class="form-group">
									<label for="pwd" class="mgr5">密&nbsp;&nbsp;&nbsp;&nbsp;码:</label>
									<input type="password"
										style="display: inline-block; width: 50%;"
										class="form-control" id="pwd" name="user.pwd" />
								</div>
								<div>
									<button type="submit" style="float: left;" class="btn btn-info">登录</button>
									<p
										style="display: inline-block; line-height: 30px; margin-left: 10px;">
										还没有账户,点击<a href="/user/register" class="mgr5 mgl5">注册</a>
									</p>
								</div>
							</form>
						</div>
						<div class="right_content col-md-5">right</div>
					</div>
				</div>
			</div><!-- panel body end -->
		</div><!-- panel end -->
	</div>
</body>
<script>
	$(function() {
		turnNav(3);
	});
</script>
</html>