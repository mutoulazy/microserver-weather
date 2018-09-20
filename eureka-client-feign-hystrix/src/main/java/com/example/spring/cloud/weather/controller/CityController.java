package com.example.spring.cloud.weather.controller;

import com.example.spring.cloud.weather.service.CityClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
  @Autowired
  private CityClient cityClient;

  @GetMapping("/cities")
  @HystrixCommand(fallbackMethod = "defaultCities")
  public String listCity() {
    return cityClient.listCity();
  }

  /**
   * 当服务提供方出现问题时，调用此方法
   * @return
   */
  public String defaultCities() {
    return "City Data Server is downing...";
  }
}
