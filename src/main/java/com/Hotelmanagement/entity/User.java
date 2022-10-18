package com.Hotelmanagement.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table
@Entity
@Data
public class User extends CommonClass {
	
	private String firstname;
	private String lastname;
	private Date dateofBirth;
	private String mobileNo;
	private String email;
	private String sex;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", dateofBirth=" + dateofBirth
				+ ", mobileNo=" + mobileNo + ", email=" + email + ", sex=" + sex + "]";
	}
	public User(Long id, String firstname, String lastname, Date dateofBirth, String mobileNo, String email,
			String sex) {
		super(id);
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateofBirth = dateofBirth;
		this.mobileNo = mobileNo;
		this.email = email;
		this.sex = sex;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
