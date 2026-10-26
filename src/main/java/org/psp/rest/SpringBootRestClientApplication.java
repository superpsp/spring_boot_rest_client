package org.psp.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestClientApplication.class, args);

        RestService service = new RestService("http://localhost:8081");
        System.out.println(service.getResponse("http://localhost:8080/api"));
    }
}
