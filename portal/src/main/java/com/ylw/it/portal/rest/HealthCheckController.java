package com.ylw.it.portal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class HealthCheckController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hk")
    public int healthCheck(){
        return 200;
    }

    @GetMapping("/msg")
    public Integer getMsg(){
        Integer result = restTemplate.getForObject("http://account-service/account/hc", Integer.class);
        return result;
    }


}
