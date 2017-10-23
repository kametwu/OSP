package com.osp.system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.osp.dao.CodeDAO;
import com.osp.dao.UserDAO;
import com.osp.entity.TCode;
import com.osp.entity.TUser;

@Component("OSPCACHE")
@Scope("singleton")
public class OSPCache {
	private final static Logger logger = LoggerFactory.getLogger(OSPCache.class);
	private Map<OSPResource, JSONObject> cacheMap;
	@Resource
	private UserDAO userDAO;
	@Resource
	private CodeDAO codeDAO;

	public Map<OSPResource, JSONObject> getCacheMap() {
		return cacheMap;
	}
	
	public OSPCache() {
		System.out.println("init cache object...");
		logger.info("Initialize global cache...");
		cacheMap = new HashMap<OSPResource, JSONObject>();
	}
	
	@PostConstruct
	private void initCacheData() {
		System.out.println("init cache data...");
		logger.info("==========> Data Cache Begin <==========");
		
		logger.info("正在缓存：用户帐号数据");
		JSONObject userData = new JSONObject();
		try {
			List<TUser> userList = userDAO.findAll();
			for (TUser user : userList) {
				userData.put(String.valueOf(user.getId()), user);
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		this.cacheMap.put(OSPResource.OSP_CACHE_USER, userData);
		
		logger.info("正在缓存：字典数据");
		JSONObject codeData = new JSONObject();
		try {
			List<TCode> codeList = codeDAO.findAll();
			for (TCode code : codeList) {
				codeData.put(code.getCodeType(), code);
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		this.cacheMap.put(OSPResource.OSP_CACHE_CODE, codeData);
		
		logger.info("==========> Data Cache End <==========");
	}
	
}
