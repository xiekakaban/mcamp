/**
 * 常用的一些javascript
 */
/**navigation 切换,只需要传递过来navigation的位置0,1,2...ALLNAV*/
function turnNav(turnPosition){
	var $navList = new Array();
	$navList[0] = $('ul.navbar-nav>li#home_page');
	$navList[1] = $('ul.navbar-nav>li#weichat_public');
	$navList[2] = $('ul.navbar-nav>li#weichat_camp');
	$navList[3] = $('ul.navbar-nav>li#login');
	$navList[4] = $('ul.navbar-nav>li#register');
	clearNav();
	for(var i=0;i<$navList.length;i++){
		if(i==turnPosition){
			$navList[i].addClass("active");
		}
	}
}
/**清空所有的navigation*/
function clearNav(){
	var $navList = new Array();
	$navList[0] = $('ul.navbar-nav>li#home_page');
	$navList[1] = $('ul.navbar-nav>li#weichat_public');
	$navList[2] = $('ul.navbar-nav>li#weichat_camp');
	$navList[3] = $('ul.navbar-nav>li#login');
	$navList[4] = $('ul.navbar-nav>li#register');
	for(var i=0;i<$navList.length;i++){
		if($navList[i].hasClass('active')){
			$navList[i].removeClass("active");
		}
	}
}
