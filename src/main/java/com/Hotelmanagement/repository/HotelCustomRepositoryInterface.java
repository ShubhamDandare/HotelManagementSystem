package com.Hotelmanagement.repository;

import java.util.List;

import com.Hotelmanagement.entity.Address;
import com.Hotelmanagement.entity.Hotel;

public interface HotelCustomRepositoryInterface {
	
	public List<Hotel> findAllByNameAndAddress(String name, Address address);

}
