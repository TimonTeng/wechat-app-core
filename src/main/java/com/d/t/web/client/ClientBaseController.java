package com.d.t.web.client;

import org.springframework.boot.autoconfigure.web.ErrorController;

import com.d.t.web.BaseController;

public class ClientBaseController extends BaseController implements ErrorController {
	
	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
