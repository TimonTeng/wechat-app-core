package com.d.t.model.json.req;

import com.d.t.model.json.BaseRequestJson;

public class LoginReqJson extends BaseRequestJson {
	
	private String account;
	
	private String password;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
