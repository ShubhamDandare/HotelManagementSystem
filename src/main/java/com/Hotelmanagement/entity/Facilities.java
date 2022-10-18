package com.Hotelmanagement.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.springframework.data.annotation.AccessType;
import org.springframework.data.annotation.AccessType.Type;

import com.Hotelmanagement.enumm.Facility;

import lombok.Data;

@Entity
@Data
@Table
//@AccessType(Type.FIELD)
public class Facilities extends CommonClass {

	@Enumerated(EnumType.STRING)
	private Facility facility;

	public Facility getFacility() {
		return facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}

	@Override
	public String toString() {
		return "Facilities [facility=" + facility + "]";
	}

	public Facilities(Long id, Facility facility) {
		super(id);
		this.facility = facility;
	}

	public Facilities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facilities(Long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

}
