package com.d.t.service;

import com.d.t.model.json.req.SysUserReqJson;
import com.d.t.model.json.res.SysUserResJson;

public interface ISysUserService {
	
	public SysUserResJson save(SysUserReqJson json);
}
