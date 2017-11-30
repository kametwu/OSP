package com.osp.base.dao;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.osp.base.entity.TCode;

@Repository
@Scope("prototype")
public interface CodeDAO extends BaseDAO {
	
	public List<TCode> findAll() throws Exception;

}
