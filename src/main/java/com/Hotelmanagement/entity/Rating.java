package com.Hotelmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data 
@Table
public class Rating extends CommonClass {

	private Long hotelId;
	private Long userId;
	private String comments;
	private int count;
	

	public Long getHotelId() {
		return hotelId;
	}
	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	

	
	public Rating(Long hotelId, Long userId, String comments, int count) {
		super();
		this.hotelId = hotelId;
		this.userId = userId;
		this.comments = comments;
		this.count = count;
	}
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
