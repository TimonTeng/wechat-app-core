package com.d.t.model.db.rent;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TRentHouse entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_rent_house")
public class TRentHouse implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -6932560829864312968L;
	private Integer id;
	private String address;
	private String houseType;
	private Integer pepoleNum;
	private Integer bedNum;
	private Long longitude;
	private Long latitude;
	private Integer userId;

	// Constructors

	/** default constructor */
	public TRentHouse() {
	}

	/** full constructor */
	public TRentHouse(String address, String houseType, Integer pepoleNum,
			Integer bedNum, Long longitude, Long latitude, Integer userId) {
		this.address = address;
		this.houseType = houseType;
		this.pepoleNum = pepoleNum;
		this.bedNum = bedNum;
		this.longitude = longitude;
		this.latitude = latitude;
		this.userId = userId;
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

	@Column(name = "Address", length = 500)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "HouseType")
	public String getHouseType() {
		return this.houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	@Column(name = "PepoleNum")
	public Integer getPepoleNum() {
		return this.pepoleNum;
	}

	public void setPepoleNum(Integer pepoleNum) {
		this.pepoleNum = pepoleNum;
	}

	@Column(name = "BedNum")
	public Integer getBedNum() {
		return this.bedNum;
	}

	public void setBedNum(Integer bedNum) {
		this.bedNum = bedNum;
	}

	@Column(name = "Longitude", precision = 12, scale = 0)
	public Long getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	@Column(name = "Latitude", precision = 12, scale = 0)
	public Long getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	@Column(name = "UserId")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}