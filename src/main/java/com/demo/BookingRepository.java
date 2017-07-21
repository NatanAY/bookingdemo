package com.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<HotelBooking, Integer> {
    List<HotelBooking> findByPricePerNightLessThan(double price);
}
