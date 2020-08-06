package com.arslan.apigatewayclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {

    @GetMapping("/api-gateway/test")
    public String clientResponse(){
        return "Client response ok";
    }
}
