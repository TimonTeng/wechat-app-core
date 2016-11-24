package com.d.t.web.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.d.t.model.ModelConstant;
import com.d.t.model.json.req.LoginReqJson;
import com.d.t.model.json.res.LoginResJson;
import com.d.t.service.ISysUserService;
import com.d.t.utils.JwtUtil;

@RestController
public class SysLoginController extends SysBaseController {
	
	@Autowired
	private ISysUserService sysUserService;
	
	@RequestMapping(value="/system/login")
	public LoginResJson login(LoginReqJson req){
		LoginResJson res = new LoginResJson();
		if(sysUserService.existUser(req.getAccount(), req.getPassword())){
			 String token = JwtUtil.encode("{}", req.getAccount(), ModelConstant.SYS_TOKEN_LIFE);
			 res.setToken(token);
			 res.setId(req.getAccount());
			 res.success();
		}else {
			res.setToken("");
			res.setId("");
		}
		return res;
	}

}
