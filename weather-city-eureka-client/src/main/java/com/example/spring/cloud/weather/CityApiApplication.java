package com.example.spring.cloud.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CityApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(CityApiApplication.class, args);
  }
}
