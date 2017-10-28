<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ include file="base.jsp"%>
        <link type="text/css" rel="stylesheet" href="<%=basePath%>/resources/css/login.css" />
    </head>
    <body>
        <div class="layout">
            <div class="header_tit">
                <div class="osplogo">
                    <img alt="一站式服务平台" src="<%=basePath%>/resources/images/logo64.png">
                </div>
                <div class="header_tit_txt">一站式服务平台</div>
            </div>
            <div class="login_area">
	            <div class="loginbox c_b">
	                <div class="lgn_inputbg c_b login-panel pwdLogin">
	                    <label class="labelbox login_user c_b" for="">
	                        <input class="item_account" autocomplete="off" type="text" id="account" placeholder="用户名/工号/邮箱">
	                    </label>
	                    <label class="labelbox pwd_panel c_b">
	                        <input type="password" placeholder="密码" autocomplete="off" id="password">
	                    </label>
	                </div>
	            </div>
	            
	            <div class="btns_bg">
	             <input class="btnadpt btn_orange" id="btn_login" type="button" value="登 录">
	             <span id="custom_display_8" class="sns-default-container sns_default_container" style="display: none;">
	             </span>
	            </div>
            </div>
        </div>  
    </body>
</html>
<script type="text/javascript" src="<%=basePath%>/resources/js/view/main/login.js"></script>