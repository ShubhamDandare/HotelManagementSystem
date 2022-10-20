package com.Hotelmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hotelmanagement.entity.Address;
import com.Hotelmanagement.entity.Hotel;

@Repository
public interface HotelRepository extends  JpaRepository<Hotel, Long>,HotelCustomRepositoryInterface{

//	List<Hotel> findAllByNameAndAddress(String name, Address address);
 
//	List<Hotel>	findAllByNameAndCityAndPin(String name,String city,String pin);

	boolean existsById(Long id);

}
