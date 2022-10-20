package com.Hotelmanagement.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

import com.Hotelmanagement.entity.Address;
import com.Hotelmanagement.entity.Hotel;

public class HotelCustomRepository implements HotelCustomRepositoryInterface {

	@Autowired
	private EntityManager manager;

	@Override
	public List<Hotel> findAllByNameAndAddress(String name, Address address) {

		CriteriaBuilder cb = manager.getCriteriaBuilder();
		CriteriaQuery createQuery = cb.createQuery();

		Root<Hotel> hotel = createQuery.from(Hotel.class);

		Predicate namePredicate = cb.equal(hotel.get("name"), name);
		Predicate addressPredicate = cb.equal(hotel.get("address"), address);

		createQuery.where(namePredicate, addressPredicate);

		TypedQuery<Hotel> createQuery2 = manager.createQuery(createQuery);

		return createQuery2.getResultList();
	}

//	@Autowired
//	private EntityManager manager;
//
//	public List<Hotel> findAllByNameAndAddress(String name, Address address) {
//
//		CriteriaBuilder cb = manager.getCriteriaBuilder();
//		CriteriaQuery createQuery = cb.createQuery();
//
//		Root<Hotel> hotel = createQuery.from(Hotel.class);
//
//		Predicate namePredicate = cb.equal(hotel.get("name"), name);
//		Predicate addressPredicate = cb.equal(hotel.get("address"), address);
//
//		createQuery.where(namePredicate, addressPredicate);
//
//		TypedQuery<Hotel> createQuery2 = manager.createQuery(createQuery);
//
//		return createQuery2.getResultList();
//	}

}
