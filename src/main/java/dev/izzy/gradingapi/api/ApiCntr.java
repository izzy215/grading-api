package dev.izzy.gradingapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiCntr {

    @GetMapping("/v1/ping")
    public String ping(){
        System.out.println("pingpong 테스트");
        return "pong";
    }
}
