package com.d.t.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.d.t.model.db.TSysUser;
import com.d.t.model.json.ListResponseJson;
import com.d.t.model.json.req.SysUserReqJson;
import com.d.t.service.ISysUserService;


@RestController
public class SysUserController extends BaseController {
	
	@Autowired
	private ISysUserService sysUserService;
	
	@RequestMapping(value="/sys/user/list")
	public ListResponseJson<TSysUser> list(){
		ListResponseJson<TSysUser> res = new ListResponseJson<TSysUser>();
		List<TSysUser> list = sysUserService.findAll();
		res.setList(list);
		res.success();
		System.out.println("ListResponseJson<TSysUser> list()");
		return res;
	}
 
	
	@RequestMapping(value="/sys/user/get")
	public String get(Integer userId) {
		System.out.println("get");
		return null;
	}
	
	@RequestMapping(value="/sys/user/save")
	public String save(SysUserReqJson user) {
		return "success";
	}
}
