package com.booking.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @GetMapping(name = "/say" , value = "/say")
    public String getBookings(){
        return "hello";
    }

}
