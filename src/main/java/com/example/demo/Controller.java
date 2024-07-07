package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class Controller {
    
    @GetMapping("/")
    public Mono<String> greet()
    {
        return getMessage()
                .zipWith(getNameFromDb())
                .map((value) -> {
                    return value.getT1()+ value.getT2();
                });
    }
    
    private Mono<String> getMessage()
    {
        return Mono.just("hello  ").delayElement(Duration.ofSeconds(5));
    }
    private Mono<String> getNameFromDb()
    {
        return Mono.just("Baibhav").delayElement(Duration.ofSeconds(6));
    }
}
