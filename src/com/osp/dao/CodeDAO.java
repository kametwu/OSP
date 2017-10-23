package com.osp.dao;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.osp.entity.TCode;

@Repository
@Scope("prototype")
public interface CodeDAO extends BaseDAO {
	
	public List<TCode> findAll() throws Exception;

}
