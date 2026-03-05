package com.example.order.management2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/welcome")
    public  String show(){
        return "hi from cicd with completed";
    }
}
