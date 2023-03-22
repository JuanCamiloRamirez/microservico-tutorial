package com.tutorial.userservice.feignclients;

import com.tutorial.userservice.model.Bike;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "bike-service")
public interface BikeFeignClient {

    @PostMapping("/bike")
    Bike save(@RequestBody Bike bike);


    @GetMapping("/bike/byuser/{userId}")
    List<Bike> getBikes
            (@PathVariable("userId") int userId);

}
