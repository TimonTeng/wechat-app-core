package com.d.t.model.json;

import com.d.t.model.ResultCode;

public class BaseResponseJson {
	
	public BaseResponseJson() {
		this.code = ResultCode.FAIL_CODE;
		this.msg = ResultCode.FAIL_DESC;
	}
	
	private String code;
	
	private String msg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void success(){
		this.code = ResultCode.SUCCE_CODE;
		this.msg = ResultCode.SUCCE_DESC;
	}

}
