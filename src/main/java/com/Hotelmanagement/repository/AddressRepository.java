package com.Hotelmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hotelmanagement.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

	List<Address> findAllByCityLikeAndPinLike(String city, String pin);
}
