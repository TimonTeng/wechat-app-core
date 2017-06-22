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
 * TRentCalendar entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_rent_calendar")
public class TRentCalendar implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 6643319236286537499L;
	private Integer id;
	private Date day;
	private Integer month;
	private Integer week;
	private Short holiday;

	// Constructors

	/** default constructor */
	public TRentCalendar() {
	}

	/** full constructor */
	public TRentCalendar(Date day, Integer month, Integer week, Short holiday) {
		this.day = day;
		this.month = month;
		this.week = week;
		this.holiday = holiday;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "Day", length = 10)
	public Date getDay() {
		return this.day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	@Column(name = "Month")
	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	@Column(name = "Week")
	public Integer getWeek() {
		return this.week;
	}

	public void setWeek(Integer week) {
		this.week = week;
	}

	@Column(name = "Holiday")
	public Short getHoliday() {
		return this.holiday;
	}

	public void setHoliday(Short holiday) {
		this.holiday = holiday;
	}

}