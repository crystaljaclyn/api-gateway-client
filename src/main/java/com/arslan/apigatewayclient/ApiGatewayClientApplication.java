package com.arslan.apigatewayclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ApiGatewayClientApplication {
    @RequestMapping(value = "/available")
    public String available() {

        return "Spring in Action";

    }

    @RequestMapping(value = "/checked-out")
    public String checkedOut() {

        return "Spring Boot in Action";

    }


    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayClientApplication.class, args);
    }

}
