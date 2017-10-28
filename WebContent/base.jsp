<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String basePath = String.format("%s://%s:%s%s", request.getScheme(), request.getServerName(), request.getServerPort(), request.getContextPath());
%>
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <title>一站式服务平台</title>
        <link rel="shortcut icon" href="<%=basePath%>/resources/images/favicon.ico" />
        <link rel="bookmark" href="<%=basePath%>/resources/images/favicon.ico" type="image/x-icon"　/>
        
        <!-- CSS -->
        <link type="text/css" rel="stylesheet" href="<%=basePath%>/resources/layui/css/layui.css" />
        
        <!-- 扩展IE8/9支持媒体查询 -->
        <!--[if lt IE 9]>
          <script type="text/javascript" src="<%=basePath%>/resources/js/html5.min.js"></script>
          <script type="text/javascript" src="<%=basePath%>/resources/js/respond.min.js"></script>
        <![endif]-->
        
        <!-- JavaScript -->
        <!-- <script type="text/javascript" src="<%=basePath%>/resources/js/javascript.extend.js"></script> -->
        <script type="text/javascript" src="<%=basePath%>/resources/js/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="<%=basePath%>/resources/layui/layui.js"></script>