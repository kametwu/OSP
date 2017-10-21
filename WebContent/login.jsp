<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>首页</title>
		<link type="text/css" rel="stylesheet" href="resources/layui/css/layui.css">
		<script type="text/javascript" src="resources/layui/layui.js"></script>
	</head>
	<body>
		<script type="text/javascript">
			layui.use(['layer', 'jquery'], function(){
			  var layer = layui.layer, $ = layui.jquery;
			  $("#btn_test").on('click', function(){
				  var load_index = layer.load(2, {shade: 0.5});
				  var options = {title: '在线调试', icon: 1};
				  $.ajax({
					  type: 'GET',
					  url: 'user/login',
					  data: {'username': 'wuliang', 'password': '123456', "age": 28},
					  dataType: 'json',
					  success: function(result) {
						  //options['content'] = JSON.stringify(result);
						  //layer.open(options);
						  $("pre#result").text(JSON.stringify(result, null, 4));
					  },
					  error:function(result){
						  //alert(JSON.stringify(errmsg));
						  $("pre#result").text(JSON.stringify(result, null, 4));
					  },
					  complete:function(result){
						  layer.close(load_index);
					  }
				  });
				  
				  //options['content'] = '可以填写任意的layer代码';
				  //layer.open(options);
			  });
			});
		</script>
		<div style="margin: 10px 10px 15px 15px;">
			<button id="btn_test" class="layui-btn layui-btn-radius">功能测试</button>
		</div>
		<pre id="result" style="border: solid 1px #F0F0F0;background-color: #FBFFFD;font-size:12px;margin: 10px 10px 15px 15px;"></pre>
	</body>
</html>