package com.osp.base.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.osp.base.dao.UserDAO;
import com.osp.base.entity.ResultModel;
import com.osp.base.entity.TUser;

@Service
@Scope("prototype")
public class UserService extends BaseService {
	@Resource
	private UserDAO userDAO;
	
	public List<TUser> findAll() throws Exception {
		return userDAO.findAll();
	}

	public ResultModel login(String account, String password) {
		ResultModel rm = new ResultModel();
		rm.setSuccess(false);
		try {
			TUser user = userDAO.findUserByLoginAccount(account);
			if(user == null) {
				rm.setMsg("该账号不存在");
			}else if(!user.getPassword().equals(password)) {
				rm.setMsg("密码不正确");
			}else if("0".equals(user.getPasswordStatus())) {
				rm.setMsg("当前密码为临时密码，请修改后登录");
			}else {
				rm.setSuccess(true);
				rm.setMsg("OK");
				user.setPassword(null);
				rm.setData(user);
			}
		} catch (Exception e) {
			rm.setMsg(e.toString());
		}
		return rm;
	}

}
