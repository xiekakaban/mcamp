<%@ page pageEncoding="UTF-8"%>
<nav class="navbar navbar-inverse"
		style="border-radius: 0px; display: fixed;">
		<div class="container-fluid">
			<div class="collapse navbar-collapse" id="nav_list">
				<ul class="nav navbar-nav">
					<li id="home_page"><a href="/index">首页</a></li>
					<li id="weichat_public"><a href="#" class="dropdown-toggle" data-toggle="dropdown"
						role="button" aria-haspopup="true" aria-expanded="false">微信公众号</a>
						<ul class="dropdown-menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">Separated link</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">One more separated link</a></li>
						</ul></li>
					<li id="weichat_camp"><a href="#">微信群</a></li>
				</ul>
			
			<form class="navbar-form navbar-left" style="margin-left:30px;"role="search">
				<div class="form-group">
		          <input type="text" class="form-control" placeholder="Search">
		        </div>
		        <button type="submit" class="btn btn-default">搜索</button>
				</form>
			<ul class="nav navbar-nav navbar-right">
				<s:if test="null != #session['username']">
					<li><span>欢迎光临 <s:property value="#session['username']"/></span></li>
					<li><a href="/user/logout">登出</a></li>
				</s:if>
				<s:else>
					<li id="login"><a href="/user/login">登录</a></li>
					<li id="register"><a href="/user/register">注册</a></li>
				</s:else>
			</ul>
			</div><!-- nav-collaspe -->
		</div><!-- container -->
	</nav>