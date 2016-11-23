package com.d.t.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.d.t.model.db.TSysUser;
import com.d.t.model.json.req.SysUserReqJson;
import com.d.t.model.json.res.SysUserResJson;
import com.d.t.repository.ISysUserRepository;
import com.d.t.service.ISysUserService;

@Service
@Transactional
public class SysUserServiceImpl implements ISysUserService {
	
	@Autowired
	private ISysUserRepository userRepository;
	
	@Override
	public List<TSysUser> findAll() {
		List<TSysUser> list = userRepository.nativeQueryList();
		return list;
	}


	@Override
	@Transactional(readOnly = false)
	public SysUserResJson save(SysUserReqJson json) {
		SysUserResJson res = new SysUserResJson();
		try {
			TSysUser entity = new TSysUser();
			entity.setAccount(json.getAccount());
			entity.setPassword(json.getPassword());
			entity.setPhoneNumber(json.getPhoneNumber());
			entity.setEmail(json.getEmail());
			entity.setAvatarIcon(json.getAvatarIcon());
			entity.setCreateTime(new Date());
			userRepository.save(entity);
			res.success();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

 
}
