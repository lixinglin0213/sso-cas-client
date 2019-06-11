package com.lixl.sso.casclient;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableCasClient
@RestController
public class CasClientApplication{

    public static void main(String[] args) {
        SpringApplication.run(CasClientApplication.class, args);
    }



    @GetMapping("/hello")
    public String demo(){
        return "world";
    }

}
