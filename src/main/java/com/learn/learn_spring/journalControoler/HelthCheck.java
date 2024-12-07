package com.learn.learn_spring.journalControoler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelthCheck {

    @GetMapping("health")
    public String Helth_Check() {
        return "Ok";
    }
}
