package com.d.t.model.json.req;

import com.d.t.model.json.BaseRequestJson;

public class SysUserReqJson extends BaseRequestJson {

	private Integer id;
	private String account;
	private String password;
	private String phoneNumber;
	private String email;
	private String avatarIcon;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAvatarIcon() {
		return avatarIcon;
	}
	public void setAvatarIcon(String avatarIcon) {
		this.avatarIcon = avatarIcon;
	}
}
