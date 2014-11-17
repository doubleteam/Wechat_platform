<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>使用帮助</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
html,body,div,span,p,ul,ol,li,a,h1,h2,h3,h4,h5,h6,img{margin:0; padding:0; border:0 none;}
body{font-size:12px; color:#333; overflow-x:hidden;}
a,a:visited{color:#333;}
#header{width:935px; height:120px; margin:0 auto; position:relative;}
#header h1{display:block; width:179px; height:88px; padding-top:20px; background:url(images/yylogo.gif) 0px 10px no-repeat;}
#header #allnav{width:550px; height:30px; line-height:30px; position:absolute; top:70px; left:550px;}
#header #allnav a{display:inline-block; display:inline; zoom:1; padding:0 15px; float:left; text-decoration:none; background:url(images/menu_line.gif) no-repeat;}
#warp{width:935px; margin:0 auto;}
#left{width:241px; margin-right:14px; float:left; display:inline;}
#right{width:675px; float:right;}
#nav{width:241px; height:auto; margin:0; padding:0;}
#nav ul{ margin:0; padding:0;border:1px; border-color:#AECAD8; border-style:solid; border-bottom:none; border-top:none; width:239px;padding-top:20px; background-color:#e6f1fb;}
#nav ul li{list-style:none; margin-top:10px; margin-bottom:20px; _margin-top:0px; padding-left:80px;}
#nav ul li.navlist1{background:url(images/navlistico20111011.png) 30px 0px no-repeat;}
#nav ul li.navlist2{background:url(images/navlistico20111011.png) 30px -210px no-repeat;}
#nav ul li.navlist3{background:url(images/navlistico20111011.png) 30px -66px no-repeat;}
#nav ul li.navlist4{background:url(images/navlistico20111011.png) 30px -139px no-repeat;}
#nav ul li.navlist5{background:url(images/navlistico20111011.png) 30px -281px no-repeat;}
#nav ul li.navlist6{background:url(images/navlistico20111011.png) 30px -351px no-repeat; margin:0; padding-bottom:20px;}
#nav ul li.navlist7{background:url(images/navlistico20111011.png) 30px -419px no-repeat; margin:0; padding-bottom:20px;}
#nav ul li.navlist8{background:url(images/navlistico20111011.png) 30px -484px no-repeat; margin:0; padding-bottom:20px;}
#nav ul li a h3{font-size:14px; font-weight:bold;}
#nav ul li a{display:block; text-decoration:none; color:#247699; cursor:hand;}
#nav ul li a p{height:24px; width:150px; color:#666; line-height:24px;}
.navfooter{width:241px; height:10px; background:url(images/nav_footer.png) no-repeat;}
#callserver{margin-bottom:10px; margin-top:10px;}
#contentus p{border:1px #8ad6b8 solid; border-top:0; border-bottom:0; padding:15px; width:208px; height:150px; line-height:24px;}
.contentus_footer{width:240px; height:4px; background:url(images/contentus_footer.png) no-repeat;}
.quickenter{width:675px; height:179px; background:url(images/bg_channel.gif) no-repeat; margin-bottom:10px;}
.quickenter ul{width:660px; margin-right:-20px; margin-left:30px; height:150px; padding-top:25px;}
.quickenter ul li.quickenterModule{list-style:none; width:190px; height:150px; float:left; margin-right:25px;}
.quickenter ul li.quickenterModule h4{font-size:14px; text-align:center; color:green;}
.quickenter ul li.quickenterModule p{text-indent:2em; color:#666; height:68px; line-height:22px; padding:5px 0;}
.quickenter ul li.quickenterModule div{display:none; font-weight:normal; text-align:center;}
.quickenter ul li.quickenterModule a{display:block; width:87px; height:20px; padding-top:9px; background:url(images/btn_click.gif) no-repeat; margin:0 auto; margin-bottom:10px; color:white; text-align:center; text-decoration:none;}
.quickenter ul li.quickenterModule a:hover{background:url(images/btn_click02.gif) no-repeat;}
.newlist{margin-bottom:10px; }
.newlist h3{width:626px; height:22px; padding-left:48px; background:url(images/bg_hot.png) no-repeat; padding-top:17px; font-size:14px;}
.newlist ol{padding-left:20px; padding-top:20px; border:1px solid #a1cee6; border-top:0; height:60px;}
.newlist ol li{width:300px; height:26px; margin-left:10px; line-height:26px; float:left; list-style:none;}
.hotpoint h3{width:621px; height:22px; padding-left:53px; background:url(images/bg_hot.png) no-repeat; padding-top:17px; font-size:14px;}
.hotpoint ul{padding-left:20px; padding-top:15px; list-style:none;  border:1px solid #a1cee6; border-top:0; height:360px; _height:370px;}
.hotpoint ul li{border-bottom:1px dashed #C7D9E7; height:22px; _height:23px; width:630px; padding-top:10px; overflow:hidden; font-size:12px;}
.hotpoint ul li span{color:#999;}
.hotpoint ul li a{display:inline-block; display:inline; zoom:1; padding-left:20px; background:url(images/hot_list.png) 10px 0px no-repeat;}
.yycp{width:965px; height:50px; margin:0 auto; text-align:center; line-height:24px; padding-top:10px;}
.yycp a{text-decoration:none; color:#333;}
.yycp a:hover,.yycp a:visited{color:#333;}

a:link,a:visited{color:#333333;  text-decoration:none;}
a:hover{color:#333333; text-decoration:underline;}
div,ul,form,p{	margin:0; padding:0;list-style:none;}
.top{margin:0 auto; position:relative; width:950px; height:75px;}
.logo{width:173px; height:53px; margin-top:9px; float:left; margin-left:10px;}
.menu{width:750px; height:35px; float:right; margin-top:36px;}
.menu ul li{width:81px;*width:72px;_width:72px; height:35px; line-height:35px; text-align:center; font-weight:bold; float:left; padding-left:0px;*padding-left:8px;_padding-left:8px;}
.menu ul li a:link{color:#016a9f; text-decoration:none;}
.menu ul li a:visited{color:#016a9f; text-decoration:none;}
.menu ul li a:hover{color:#016a9f; text-decoration:underline;}
.menu .morenzhuangtai{background-image:url(../images/common/menumorenzhuagntaibg.jpg); background-repeat:no-repeat; background-position:center bottom; color:#FFFFFF;}
.inputbtn {background-color: #f7fafc;border: 1px solid #b8cad6;}
body{ margin:0; padding:0; font-family:Verdana, Arial, Helvetica, sans-serif; font-size:12px; color:#333333; }
.login{color:#666666; width:550px; height:30px; padding:0 20px 0 0; position:absolute; right:100px; text-align:right; top:10px;}
.tophelp{color:#738197; width:50px; height:30px; padding:3px 10px 0px 0px; *padding:5px 10px 0px 0px; _padding:5px 10px 0px 0px;position:absolute; right:40px;text-align:right; top:10px; background:url(http://www.yy.com/images/common/iconask.jpg) no-repeat 5px 2px;}
.tophelp a:link,.tophelp a:visited{color:#738197; text-decoration:none;}
.tophelp a:hover{color:#738197; text-decoration:underline;}
.top .login a:link{color:#0c45a2;  font-size:12px;}
.top .login a:hover{color:#f00; text-decoration:underline;}
* {word-wrap : break-word ;word-break : break-all ;}
.clearfix {content: "."; font-size: 1px; display: block; height: 0 !important; height: 1%; clear: both; visibility: hidden; background: none; line-height: 0%; }
a.orange,a.orange:hover{color:#fa7408!important;}
</style>

<script type="text/javascript">
	
	function myVip(){
		document.getElementById("myVip").style.display="block";
		document.getElementById("about").style.display="none";
		document.getElementById("more").style.display="none";
		document.getElementById("menu").style.display="none";
		
		document.getElementById("baga").style.display="block";
	}
	
	function about(){
		document.getElementById("myVip").style.display="none";
		document.getElementById("about").style.display="block";
		document.getElementById("more").style.display="none";
		document.getElementById("menu").style.display="none";
		
		document.getElementById("baga").style.display="block";
	}
	
	function more(){
		document.getElementById("myVip").style.display="none";
		document.getElementById("about").style.display="none";
		document.getElementById("more").style.display="block";
		document.getElementById("menu").style.display="none";
		
		document.getElementById("baga").style.display="block";
	}
	function menu(){
		document.getElementById("myVip").style.display="none";
		document.getElementById("about").style.display="none";
		document.getElementById("more").style.display="none";
		document.getElementById("menu").style.display="block";
		
		document.getElementById("baga").style.display="block";
	}
	
	window.onload = function (){
		document.getElementById("myVip").style.display="none";
		document.getElementById("about").style.display="none";
		document.getElementById("more").style.display="none";
		document.getElementById("menu").style.display="none";
		
		document.getElementById("baga").style.display="none";
	}	
	
	var i=1;
  	function h(){
    	if(i==1){
			document.getElementById("h").innerHTML=".";
		 	i=i+1;
		}
  		else if(i==2){
		 	document.getElementById("h").innerHTML="..";
			i=i+1;
		}
		else if(i==3){
			document.getElementById("h").innerHTML="...";
	  		i=i+1;
		}
		else if(i==4){
			document.getElementById("h").innerHTML="....";
	  		i=1;
		}
	}
	setInterval("h()",800);
</script>

</head>
<body>

<script type="text/javascript" src="/m/js/jquery.js"></script>

<br />
<div id="warp">
	<div id="left">
	<!--菜单栏-->
		<div id="nav">
		<h2>帮助中心<label id="h"></label></h2><br/>
			<ul>
				<li class="navlist1">
					<a onclick="myVip()">
					<h3>我的会员</h3>
					</a>
				</li>
				<li class="navlist2">
					<a onclick="about()">
					<h3>关于我们</h3>
					</a>
				</li>
				<li class="navlist3">
					<a onclick="more()">
					<h3>更多体验</h3>
					</a>
				</li>
				<li class="navlist4">
					<a onclick="menu()">
					<h3>数字菜单</h3>
					</a>
				</li>
			</ul>
			<div class="navfooter"></div>
		</div>
	<!--菜单栏结束-->
	<!--呼叫客服-->
	<div id="callserver">
	<li>
		<a href="javascript:alert('电话：18310099024\nQQ：1476862555')" style="color: green">联系客服</a>
		</li>
	</div>
	<!--呼叫客服结束-->
	</div>
	请点击右侧相应功能
	<!-- 我的会员 -->
	<div class="hotpoint">
		<div id="myVip">
			<h3>功能介绍</h3>
			<ul>
					<li><span>我的积分</span><a>会员积分，可消费获得，可充值金币获得，第一次关注积分为0。</a></li>
					<li><span>我的金币</span><a>会员金币，可充值获得，第一次关注金币为0。</a></li>
					<li><span>我的会员等级</span><a>会员等级，充值多少而定，充值一定金额，可升级。第一次关注微黄铜</a></li>
					<li><span>我的状态</span><a>状态分为两种，正常与冻结。正常情况下可用，冻结情况下不可用。</a></li>
					
						<li id="baga"><span></span><a></a></li>
						<li id="baga"><span></span><a></a></li>
						<li id="baga"><span></span><a></a></li>
						<li id="baga"><span></span><a></a></li>
						<li id="baga"><span></span><a></a></li>
						<li id="baga"><span>关注</span><a>关注后，立即往数据库插入一条数据，会员积分，金币为0，等级为“黄铜”，状态为“正常”。</a></li>
						<li id="baga"><span>取消关注</span><a>取消关注后，视放弃会员身份，会立即删除会员信息。</a></li>
			</ul>	
				
		</div>
	</div>
	
	<!-- 关于我们 -->
	<div id="about">
	<div class="hotpoint">
		<h3>功能介绍</h3>
		<ul>
				<li><span>服务范围</span><a>当前服务商服务的范围。</a></li>
				<li><span>服务时间</span><a>当前服务商服务的时间。</a></li>
				<li><span>联系方式</span><a>当前服务商的联系方式（包括电话，QQ）。</a></li>
				<li><span>优惠套餐</span><a>当前服务商的某些服务价格或套餐。</a></li>
				
					<li id="baga"><span></span><a></a></li>
					<li id="baga"><span></span><a></a></li>
					<li id="baga"><span></span><a></a></li>
					<li id="baga"><span></span><a></a></li>
					<li id="baga"><span></span><a></a></li>
					<li id="baga"><span>关注</span><a>关注后，立即往数据库插入一条数据，会员积分，金币为0，等级为“黄铜”，状态为“正常”。</a></li>
					<li id="baga"><span>取消关注</span><a>取消关注后，视放弃会员身份，会立即删除会员信息。</a></li>
		</ul>		
	</div>
	</div>
	
	<!-- 更多体验 -->
	<div id="more">
	<div class="hotpoint">
		<h3>功能介绍</h3>
		<ul>
				<li><span>幽默笑话</span><a>随机抽选幽默笑话。</a></li>
				<li><span>使用帮助</span><a>使用帮助文档</a></li>
				
					<li id="baga"><span></span><a></a></li>
					<li id="baga"><span></span><a></a></li>
					<li id="baga"><span></span><a></a></li>
					<li id="baga"><span></span><a></a></li>
					<li id="baga"><span></span><a></a></li>
					<li id="baga"><span></span><a></a></li>
					<li id="baga"><span></span><a></a></li>
					<li id="baga"><span>关注</span><a>关注后，立即往数据库插入一条数据，会员积分，金币为0，等级为“黄铜”，状态为“正常”。</a></li>
					<li id="baga"><span>取消关注</span><a>取消关注后，视放弃会员身份，会立即删除会员信息。</a></li>
		</ul>		
	</div>
	</div>
	
	<!-- 数字菜单 -->
	<div id="menu">
	<div class="hotpoint">
		<h3>功能介绍</h3>
		<ul>
				<li><span>数字"1"</span><a>新闻</a></li>
				<li><span>数字"2"</span><a>待开放</a></li>
				<li><span>数字"3"</span><a>待开放</a></li>
				<li><span>"?"</span><a>显示数字菜单</a></li>
				<li><span>"表情"</span><a>您发送一个表情，我们会回复您的表情</a></li>
				
					<li id="baga"><span></span><a></a></li>
					<li id="baga"><span></span><a></a></li>
					<li id="baga"><span></span><a></a></li>
					<li id="baga"><span></span><a></a></li>
					<li id="baga"><span>关注</span><a>关注后，立即往数据库插入一条数据，会员积分，金币为0，等级为“黄铜”，状态为“正常”。</a></li>
					<li id="baga"><span>取消关注</span><a>取消关注后，视放弃会员身份，会立即删除会员信息。</a></li>
		</ul>		
	</div>
	</div>
	
</div>


</body>
</html>
