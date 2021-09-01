package com.ylw.it.portal;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableDiscoveryClient
@SpringBootApplication
public class PortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalApplication.class,args);

        /**
         * 如下是负载均衡重要的拦截器。实现负载均衡
         */
//        org.springframework.cloud.client.loadbalancer.LoadBalancerInterceptor in;
        org.springframework.http.client.ClientHttpRequestInterceptor interceptor;
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        RestTemplate template =new RestTemplate();
        return template;
    }
}
