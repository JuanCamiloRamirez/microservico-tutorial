package com.tutorial.userservice.feignclients;

import com.tutorial.userservice.model.Bike;
import com.tutorial.userservice.model.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "bike-service", url = "http://localhost:8083/bike")
public interface BikeFeignClient {

    @PostMapping()
    Bike save(@RequestBody Bike bike);


    @GetMapping("/byuser/{userId}")
    List<Bike> getBikes
            (@PathVariable("userId") int userId);

}
