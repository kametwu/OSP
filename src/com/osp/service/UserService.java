package com.osp.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.osp.dao.UserDAO;
import com.osp.entity.User;

@Service
@Scope("prototype")
public class UserService extends BaseService {
	@Resource
	private UserDAO userDAO;
	
	public List<User> findAll() throws Exception {
		return userDAO.findAll();
	}

}
