package com.Hotelmanagement.specification;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import com.Hotelmanagement.entity.Address;
import com.Hotelmanagement.entity.Hotel;


@Component
public class HotelSpecification {

	public static Specification<Hotel> searchHotelbyName(String name){
		return ( (root, query, criteriaBuilder) -> {
		return	criteriaBuilder.like(root.get("name"),"%"+name+"%");
		});
	}
	
	public static Specification<Hotel> searchHotelbyAddress(Address address){
		return ( (root, query, criteriaBuilder) -> {
		return	criteriaBuilder.equal(root.get("address"),address);
		});
	}
}
