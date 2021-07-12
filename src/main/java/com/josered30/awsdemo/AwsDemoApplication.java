package com.josered30.awsdemo;

import com.josered30.awsdemo.entity.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@SpringBootApplication
public class AwsDemoApplication {

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> index() {
        return ResponseEntity.ok(new Response("Hello"));
    }

    public static void main(String[] args) {
        SpringApplication.run(AwsDemoApplication.class, args);
    }

}
