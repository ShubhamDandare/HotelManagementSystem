package com.Hotelmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotelmanagement.entity.Address;
import com.Hotelmanagement.entity.Hotel;
import com.Hotelmanagement.repository.AddressRepository;
import com.Hotelmanagement.repository.HotelRepository;

@Service
public class HotelManagementService {

	@Autowired
	private HotelRepository hotelRepository;

	@Autowired
	private AddressRepository addressRepository;

	public Hotel saveHotel(Hotel hotel) {
		Hotel save = hotelRepository.save(hotel);
		return save;
	}

	public Hotel updateHotel(Long id, Hotel hotel) {
		Hotel getHotel = hotelRepository.findById(id).orElseThrow(() -> new RuntimeException("hotel not found" + id));
		hotel.setId(getHotel.getId());
		// hotel.
		Hotel save = hotelRepository.save(hotel);

		return save;
	}

	public List<Hotel> getAllHotel() {
		List<Hotel> findAll = hotelRepository.findAll();
		return findAll;
	}

	public List<Hotel> searchHotel(String name, Address address) {
		List<Hotel> findAllByNameAndLocation = hotelRepository.findAllByNameAndAddress(name, address);
		return findAllByNameAndLocation;
	}

	
}
