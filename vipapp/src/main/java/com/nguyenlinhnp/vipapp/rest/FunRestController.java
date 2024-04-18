package com.nguyenlinhnp.vipapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${team.name}")
    private String teamName;
    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/dz")
    public String linhDz(){
        return "hello adu Linhdz" + teamName;
    }


}
