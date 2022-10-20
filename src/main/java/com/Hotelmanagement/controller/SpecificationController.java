package com.Hotelmanagement.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.criteria.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Hotelmanagement.dto.SearchDto;
import com.Hotelmanagement.entity.Address;
import com.Hotelmanagement.entity.Hotel;
import com.Hotelmanagement.repository.HotelRepository;
import com.Hotelmanagement.service.HotelManagementService;
import com.Hotelmanagement.specification.HotelSpecification;

@RestController
@RequestMapping("/hotel/specification")
public class SpecificationController {

	@Autowired
	private HotelManagementService service;

	@Autowired
	private HotelRepository repository;
	
	@PostMapping("/filter")
	public List<Hotel> filterHotels(@RequestBody List<SearchDto> dtos){
		
//		List<Specification<Hotel>> collect = dtos.stream().map(this::getSpecification).collect(Collectors.toList());
		Specification<Hotel> specification = getSpecification(dtos);
		
		return repository.findAll(specification);
	}

	public Specification<Hotel> getSpecification(List<SearchDto> dtos){
		List<Predicate> prdicates = new ArrayList<>();
		
		return (root, query, criteriaBuilder) -> {
			for(SearchDto dto : dtos) {
				if(dto.getJoinAttribute()!=null) {
					Predicate join = criteriaBuilder.equal(root.join(dto.getJoinAttribute()).get(dto.getColumn()),dto.getValue() );
					prdicates.add(join);
				}else {
				Predicate equal = criteriaBuilder.equal(root.get(dto.getColumn()), dto.getValue());
				prdicates.add(equal);
				}
			}
			return criteriaBuilder.and(prdicates.toArray(new Predicate[0]));
			
		};
	
	}
	
	@GetMapping("/search")
	public List<Hotel> searchHotel(@RequestParam String name, @RequestParam Address address) {
		Specification<Hotel> specification = Specification.where(
				HotelSpecification.searchHotelbyName(name).and(HotelSpecification.searchHotelbyAddress(address)));
		return repository.findAll(specification);
	}

	@GetMapping("/byname")
	public List<Hotel> searchHotelbyName(@RequestParam String name) {
		Specification<Hotel> specification = Specification.where(HotelSpecification.searchHotelbyName(name));
		return repository.findAll(specification);
	}

}
