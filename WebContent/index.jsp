<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>报表结构设计</title>
<style type="text/css">
	html,body{
		height:90%;
		width:60%;
		margin:auto;
	}
	tr{
		height:35px;
	}
	input{
		padding:0;  
		width: 99.8%; 
		margin:auto; 
		height:35px;
		font-size: 20px;
	}
	caption{
		margin-bottom: 20px; 
		margin-top: 20px;
	}
</style>
</head>
<body style="background-color:#CCFFFF;">
	<div id="content" style="margin-left:5%; margin-right:5%;">
		<form action="customReportHeader.action" method="post">
			<table border=1px; cellSpacing=0px; style="padding:0;  width:100%; margin:auto;">
				<caption><font style="font-weight:bold; font-size:24px;">注册信息</font></caption>
				<tr style="height: 35px;">
					<td style="text-align:center;">姓名</td>
					<td><input type="text" name="report_name"/></td>
				</tr>
				<tr>
					<td style="text-align:center;">昵称</td>
					<td><input type="text" name="column1"/></td>
				</tr>
				<tr>
					<td style="text-align:center;">邮箱</td>
					<td><input type="text" name="column2"/></td>
				</tr>
				<tr>
					<td style="text-align:center;">联系方式</td>
					<td><input type="text" name="column3"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="提交" style="padding:0;  width: 10%; margin:auto;  height:35px;"/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>