package com.kbh.student.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class web {

    @GetMapping("/")
    public String main(){
        return "gellowwold";
    }
}