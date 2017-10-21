package com.osp.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.osp.entity.User;
import com.osp.service.UserService;

@Controller
@Scope("prototype")
@RequestMapping("/user")
public class UserController extends BaseController {
	@Resource
	private UserService userService;
	
	@RequestMapping("/login")
	@ResponseBody
	public String login() throws Exception {
		boolean success = false;
		String msg = null;
		List<User> list = null;
		try {
			list = userService.findAll();
			success = true;
		} catch (Exception e) {
			msg = e.getMessage();
		}
		return this.returnJSON(success, msg, list);
	}
	
}
