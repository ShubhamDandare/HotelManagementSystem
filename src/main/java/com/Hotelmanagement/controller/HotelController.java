package com.Hotelmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Hotelmanagement.entity.Address;
import com.Hotelmanagement.entity.Hotel;
import com.Hotelmanagement.service.HotelManagementService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private HotelManagementService service;

	@PostMapping("/save")
	public Hotel saveHotel(@RequestBody Hotel hotel) {
		Hotel saveHotel = service.saveHotel(hotel);
		return saveHotel;

	}

	@GetMapping("/all")
	public List<Hotel> getAllHotel() {
		List<Hotel> allHotel = service.getAllHotel();
		return allHotel;
	}

	// address data save hoyil in db
	@GetMapping("/search")
	public List<Hotel> searchHotel(@RequestParam String name, @RequestParam Address address) {
		List<Hotel> searchHotel = service.searchHotel(name, address);
		return searchHotel;
	}
	
	@PostMapping("/search/post")
	public List<Hotel> searchHotelbypost(@RequestParam String name, @RequestBody Address address) {
		List<Hotel> searchHotel = service.searchHotel(name, address);
		return searchHotel;
	}

}
