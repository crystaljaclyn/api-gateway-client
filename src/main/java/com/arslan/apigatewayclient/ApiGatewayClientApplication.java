package com.arslan.apigatewayclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
public class ApiGatewayClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayClientApplication.class, args);
    }

}
