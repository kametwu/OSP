package com.osp.base.controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.osp.base.system.CacheManager;
import com.osp.base.util.OSPUtil;

@Transactional
public class BaseController {
	protected final static String CONTENT_TYPE_JSON = "text/json;charset=utf-8";
	protected final static String CONTENT_TYPE_HTML = "text/html;charset=utf-8";
	@Resource(name="OSPCACHE")
	protected CacheManager ospCache;
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private HttpServletResponse response;
	private Map<String, String> paramMap;
	
	protected Map<String, String> getParamMap() {
		if(paramMap == null) {
			paramMap = new HashMap<String, String>();
			Enumeration<String> keys = request.getParameterNames();
			while (keys.hasMoreElements()) {
				String key = keys.nextElement();
				String value = request.getParameter(key);
				paramMap.put(key, value);
			}
		}
		return paramMap;
	}
	
	protected String returnJSON(boolean success, String msg, Object obj) throws IOException {
		JSONObject result = new JSONObject();
		result.put("success", success);
		result.put("msg", msg);
		result.put("data", obj);
		return  OSPUtil.toJSONString(result);
	}
	
	protected String writeToResponse(String contentType, String dataString) throws IOException{
		response.setContentType(contentType);
		response.getWriter().write(dataString);
		response.flushBuffer();
		return dataString;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public HttpSession getSession() {
		return request.getSession();
	}

	public HttpServletResponse getResponse() {
		return response;
	}

}
