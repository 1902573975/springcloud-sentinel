package com.ylw.it.portal.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HealthCheckController {

    @GetMapping("/hk")
    public int healthCheck(){
        return 200;
    }
}
