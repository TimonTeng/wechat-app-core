package com.d.t.web.sys;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.d.t.model.ModelConstant;

@RestController
public class SystemController extends SysBaseController {
	
	@RequestMapping(value = "/error")
	public String error(){
		return response().getHeader(ModelConstant.SYS_HEADER_KEY_MSG);
	}

}
