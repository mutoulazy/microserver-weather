package com.example.spring.cloud.weather.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {
  @Value("${auther}")
  private String auther;

  @GetMapping("/config")
  public String config() {
    return "config:auther: " + auther;
  }

}
