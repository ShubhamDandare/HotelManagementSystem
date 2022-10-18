package com.Hotelmanagement.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class CommonClass {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CommonClass [id=" + id + "]";
	}

	public CommonClass(Long id) {
		super();
		this.id = id;
	}

	public CommonClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
