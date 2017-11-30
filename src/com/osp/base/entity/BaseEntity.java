package com.osp.base.entity;

import com.osp.base.util.OSPUtil;

public class BaseEntity {
	
	@Override
	public String toString() {
		return OSPUtil.toJSONString(this);
	}

}
