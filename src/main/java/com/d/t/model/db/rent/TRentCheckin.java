package com.d.t.model.db.rent;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TRentCheckin entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_rent_checkin", catalog = "rent")
public class TRentCheckin implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -988632178845648797L;
	private Integer id;
	private Integer userId;
	private Short appPlatform;
	private Integer houseId;
	private String custName;
	private String custPhone;
	private Date checkinDay;
	private Date checkoutDay;

	// Constructors

	/** default constructor */
	public TRentCheckin() {
	}

	/** full constructor */
	public TRentCheckin(Integer userId, Short appPlatform, Integer houseId,
			String custName, String custPhone, Date checkinDay, Date checkoutDay) {
		this.userId = userId;
		this.appPlatform = appPlatform;
		this.houseId = houseId;
		this.custName = custName;
		this.custPhone = custPhone;
		this.checkinDay = checkinDay;
		this.checkoutDay = checkoutDay;
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

	@Column(name = "UserId")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "AppPlatform")
	public Short getAppPlatform() {
		return this.appPlatform;
	}

	public void setAppPlatform(Short appPlatform) {
		this.appPlatform = appPlatform;
	}

	@Column(name = "HouseId")
	public Integer getHouseId() {
		return this.houseId;
	}

	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}

	@Column(name = "CustName", length = 40)
	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Column(name = "CustPhone", length = 24)
	public String getCustPhone() {
		return this.custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CheckinDay", length = 10)
	public Date getCheckinDay() {
		return this.checkinDay;
	}

	public void setCheckinDay(Date checkinDay) {
		this.checkinDay = checkinDay;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CheckoutDay", length = 10)
	public Date getCheckoutDay() {
		return this.checkoutDay;
	}

	public void setCheckoutDay(Date checkoutDay) {
		this.checkoutDay = checkoutDay;
	}

}