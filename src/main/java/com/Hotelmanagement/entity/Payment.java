package com.Hotelmanagement.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table
@Data
public class Payment extends CommonClass{
	
	private Long userId;
	private Long hotelId;
	private double price;
	@Temporal(TemporalType.DATE)
	private Date paymentDate=new Date(System.currentTimeMillis());
	
	public Long getUserId() { 
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getHotelId() {
		return hotelId;
	}
	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	@Override
	public String toString() {
		return "Payment [userId=" + userId + ", hotelId=" + hotelId + ", price=" + price + ", paymentDate="
				+ paymentDate + "]";
	}
	public Payment(Long id, Long userId, Long hotelId, double price, Date paymentDate) {
		super(id);
		this.userId = userId;
		this.hotelId = hotelId;
		this.price = price;
		this.paymentDate = paymentDate;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(Long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
