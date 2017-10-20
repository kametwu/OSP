package com.osp.dao;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.osp.entity.User;

@Repository
@Scope("prototype")
public interface UserDAO extends BaseDAO {
	
	public List<User> findAll();

}
