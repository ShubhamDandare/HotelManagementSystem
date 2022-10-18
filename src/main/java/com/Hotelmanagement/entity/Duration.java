package com.Hotelmanagement.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class Duration extends CommonClass {
	private Date fromDate;
	private Date toDate;
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	@Override
	public String toString() {
		return "Duration [fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}
	public Duration(Date fromDate, Date toDate) {
		super();
		this.fromDate = fromDate;
		this.toDate = toDate;
	}
	public Duration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
