package com.osp.controller;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.osp.entity.TUser;
import com.osp.service.UserService;
import com.osp.system.OSPResource;

import jodd.util.StringUtil;

@Controller
@Scope("prototype")
@RequestMapping("/user")
public class UserController extends BaseController {
	@Resource
	private UserService userService;
	
	/**
	 * 系统登录
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/login", method=RequestMethod.POST)
	@ResponseBody
	public String login() throws Exception {
		boolean success = false;
		String msg = null;
		TUser user = null;
		try {
			String account = this.getParamMap().get("account");
			String password = this.getParamMap().get("password");
			user = userService.login(account, password);
			success = true;
		} catch (Exception e) {
			msg = e.getMessage();
		}
		return this.returnJSON(success, msg, user);
	}
	
	@RequestMapping(value={"/listall", "/listall/{id}"}, method=RequestMethod.GET)
	@ResponseBody
	public String findUser(@PathVariable(value="id", required=false) String id) throws Exception {
		JSONObject obj = this.ospCache.getCacheMap().get(OSPResource.OSP_CACHE_USER);
		if(StringUtil.isEmpty(id)) {
			return this.returnJSON(true, "OK", obj);
		}else {
			return this.returnJSON(true, "OK", obj.get(id));
		}
	}
	
	@RequestMapping(value={"/code", "/code/{type}", "/code/{type}/{item}"}, method=RequestMethod.GET)
	@ResponseBody
	public String findCode(@PathVariable(value="type", required=false) String type, @PathVariable(value="item", required=false) String item) throws Exception {
		JSONObject obj = this.ospCache.getCacheMap().get(OSPResource.OSP_CACHE_CODE);
		if(StringUtil.isAllEmpty(type, item)) {
			return this.returnJSON(true, "OK", obj);
		}else if(StringUtil.isEmpty(item)) {
			return this.returnJSON(true, "OK", obj.get(type));
		}else {
			return this.returnJSON(true, "OK", ((JSONObject)obj.get(type)).get(item));
		}
	}
	
}
