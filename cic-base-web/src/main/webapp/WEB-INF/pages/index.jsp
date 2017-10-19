<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%=request.getContextPath() %>"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>测试NUI</title>

		<meta name="description" content="User login page" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
		<%-- <script src="${ctx}/assets/js/jquery.cookie.js"></script> --%>
		<link id="css_skin" rel="stylesheet" type="text/css" href="${ctx}/common/skins/skin1/css/style.css"/>
		<link id="css_icon" rel="stylesheet" type="text/css" href="${ctx}/common/icons/icon.css"/>
		<script type="text/javascript" src="${ctx}/nui/nui.js"></script>
		<script>
		(function(){
			nui.context='${ctx}'
		})();
		
		var data={};
		nui.DataTree.prototype.dataField='data';//兼容改造
</script>
	</head>
<body>
    aaa
<input id="aaa" class="mini-textbox" emptyText="请输入..."/>
<div class="mini-panel" title="Panel" height="200">
</div>
</body>
</html>
