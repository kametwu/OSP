package com.osp.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.osp.entity.User;
import com.osp.service.UserService;

@Controller
@Scope("prototype")
@RequestMapping("/user")
public class UserAction extends BaseAction {
	@Resource
	private UserService userService;
	
	@RequestMapping("/login")
	@ResponseBody
	public Object login() {
		List<User> list = userService.findAll();  
        return JSONArray.toJSONString(list); 
	}
	
}
