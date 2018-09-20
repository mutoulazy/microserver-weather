package com.example.spring.cloud.weather.controller;

import com.example.spring.cloud.weather.bean.City;
import com.example.spring.cloud.weather.service.CityDataService;
import java.io.IOException;
import java.util.List;
import javax.xml.bind.JAXBException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityController {
  @Autowired
  private CityDataService cityDataService;

  @GetMapping
  public List<City> listCity() throws JAXBException, IOException {
    return cityDataService.listCity();
  }
}
