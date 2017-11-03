package com.osp.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.osp.dao.UserDAO;
import com.osp.entity.OResult;
import com.osp.entity.TUser;

@Service
@Scope("prototype")
public class UserService extends BaseService {
	@Resource
	private UserDAO userDAO;
	
	public List<TUser> findAll() throws Exception {
		return userDAO.findAll();
	}

	public OResult login(String account, String password) {
		OResult ret = new OResult();
		ret.setSuccess(false);
		try {
			TUser user = userDAO.findUserByLoginAccount(account);
			if(user == null) {
				ret.setMsg("该账号不存在");
			}else if(!user.getPassword().equals(password)) {
				ret.setMsg("密码不正确");
			}else if("0".equals(user.getPasswordStatus())) {
				ret.setMsg("当前密码为临时密码，请修改后登录");
			}else {
				ret.setSuccess(true);
				ret.setMsg("OK");
				user.setPassword(null);
				ret.setData(user);
			}
		} catch (Exception e) {
			ret.setMsg(e.toString());
		}
		return ret;
	}

}
