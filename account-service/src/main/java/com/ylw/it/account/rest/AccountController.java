package com.ylw.it.account.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/hc")
    public int healthCheck(){
        org.springframework.cloud.alibaba.sentinel.SentinelProperties f;
        return 200;
    }
}
