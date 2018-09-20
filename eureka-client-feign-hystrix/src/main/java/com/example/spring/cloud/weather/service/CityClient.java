package com.example.spring.cloud.weather.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "msa-weather-city-eureka")
public interface CityClient {

  @GetMapping("/cities")
  String listCity();
}
