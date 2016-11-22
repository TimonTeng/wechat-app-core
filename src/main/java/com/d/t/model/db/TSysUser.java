package com.d.t.model.db;
 

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TSysUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_sys_user", catalog = "jue")
public class TSysUser implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 7494193483066934708L;
	
	private Integer id;
	private String account;
	private String password;
	private String phoneNumber;
	private String email;
	private String avatarIcon;
	private Date createTime;
	private Date loginTime;

	// Constructors

	/** default constructor */
	public TSysUser() {
	}

	/** minimal constructor */
	public TSysUser(Date createTime, Date loginTime) {
		this.createTime = createTime;
		this.loginTime = loginTime;
	}

	/** full constructor */
	public TSysUser(String account, String password, String phoneNumber,
			String email, String avatarIcon, Date createTime,
			Date loginTime) {
		this.account = account;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.avatarIcon = avatarIcon;
		this.createTime = createTime;
		this.loginTime = loginTime;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "Account", length = 50)
	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Column(name = "Password", length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "PhoneNumber", length = 30)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "Email", length = 30)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "AvatarIcon", length = 200)
	public String getAvatarIcon() {
		return this.avatarIcon;
	}

	public void setAvatarIcon(String avatarIcon) {
		this.avatarIcon = avatarIcon;
	}

	@Column(name = "CreateTime", length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "LoginTime", length = 19)
	public Date getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

}