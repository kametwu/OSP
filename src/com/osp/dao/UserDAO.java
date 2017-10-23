package com.osp.dao;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.osp.entity.TUser;

@Repository
@Scope("prototype")
public interface UserDAO extends BaseDAO {

	public List<TUser> findAll() throws Exception;
	
	public TUser findUserById(String id) throws Exception;

}
