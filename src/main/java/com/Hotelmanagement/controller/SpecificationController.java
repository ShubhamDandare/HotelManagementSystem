package com.Hotelmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Hotelmanagement.entity.Address;
import com.Hotelmanagement.entity.Hotel;
import com.Hotelmanagement.repository.HotelRepository;
import com.Hotelmanagement.service.HotelManagementService;
import com.Hotelmanagement.specification.HotelSpecification;

@RestController
@RequestMapping("/specification")
public class SpecificationController {

	@Autowired
	private HotelManagementService service;

	@Autowired
	private HotelRepository repository;

	@GetMapping("/search")
	public List<Hotel> searchHotel(@RequestParam String name, @RequestParam Address address) {
		Specification<Hotel> specification = Specification.where(
				HotelSpecification.searchHotelbyName(name).and(HotelSpecification.searchHotelbyAddress(address)));
		return repository.findAll(specification);
	}
}
