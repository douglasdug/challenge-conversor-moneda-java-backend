package com.example.challenge_conversor_moneda_java_backend.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConvertidorMoneda {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
