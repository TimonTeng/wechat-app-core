package com.d.t.model.json.req;

import com.d.t.model.json.BaseRequestJson;

public class CheckTokenReqJson extends BaseRequestJson {
	
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
