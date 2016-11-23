package com.d.t.service;

import java.util.List;

import com.d.t.model.db.TSysUser;
import com.d.t.model.json.req.SysUserReqJson;
import com.d.t.model.json.res.SysUserResJson;

public interface ISysUserService {
	
	public SysUserResJson save(SysUserReqJson json);
	
	public List<TSysUser> findAll();
}
