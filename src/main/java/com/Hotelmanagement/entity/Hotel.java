package com.Hotelmanagement.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import lombok.Data;

@Data
@Entity
@Table
public class Hotel extends CommonClass {

	private String name;

	@Enumerated(EnumType.STRING)
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "hotel_facility", joinColumns = @JoinColumn(name = "hoteldb.hotel_id"), inverseJoinColumns = @JoinColumn(name = "hoteldb.facilities_id"))
	private Set<Facilities> facilities = new HashSet<Facilities>();

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Address address;

	private int price;

//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private Rating rating;
//	
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<Room> rooms;


	@Override
	public String toString() {
		return "Hotel [name=" + name + ", facilities=" + facilities + ", address=" + address + ", price=" + price + "]";
	}

	

	public Hotel(Long id, String name,  Address address, int price) {
	super(id);
	this.name = name;
	this.address = address;
	this.price = price;
}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Set<Facilities> getFacilities() {
		return facilities;
	}



	public void setFacilities(Set<Facilities> facilities) {
		this.facilities = facilities;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(Long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

//

}
