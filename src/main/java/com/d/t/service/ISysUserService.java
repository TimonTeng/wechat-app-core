package com.d.t.service;

import java.util.List;

import com.d.t.model.db.TSysUser;
import com.d.t.model.json.req.SysUserReqJson;
import com.d.t.model.json.res.SysUserResJson;

public interface ISysUserService {
	
	public SysUserResJson save(SysUserReqJson json);
	
	public List<TSysUser> findAll();
	
	public TSysUser getUser(String account, String password);
	
	/**
	 * 用户是否存在
	 * @param account
	 * @param password
	 * @return
	 */
	public boolean existUser(String account, String password);
}
