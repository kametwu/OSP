package com.osp.entity;

import com.osp.util.OSPUtil;

public class BaseEntity {
	
	@Override
	public String toString() {
		return OSPUtil.toJSONString(this);
	}

}
