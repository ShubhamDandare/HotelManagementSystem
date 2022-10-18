package com.Hotelmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hotelmanagement.entity.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {

}
