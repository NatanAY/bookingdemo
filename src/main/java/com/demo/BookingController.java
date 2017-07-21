package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    public BookingController(){
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public List<HotelBooking> getAll(){
        return bookingRepository.findAll();
    }

    @RequestMapping(value = "/affordable/{price}", method = RequestMethod.GET)
    public List<HotelBooking> getAffordable(@PathVariable double price){
        return bookingRepository.findByPricePerNightLessThan(price);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<HotelBooking> create(@RequestBody HotelBooking hotelBooking){
        bookingRepository.save(hotelBooking);
        return bookingRepository.findAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public List<HotelBooking> remove(@PathVariable Integer id){
        bookingRepository.delete(id);
        return bookingRepository.findAll();
    }

}