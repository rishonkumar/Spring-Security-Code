package com.springsecuritylearn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "Hi";
    }


    @GetMapping("/admin")
    public String admin() {
        return "hi";
    }

}
