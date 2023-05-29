package com.demo.tomaskeycloak;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {
    
    @GetMapping()
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/user")
    // Rol autorizado
    @PreAuthorize("hasRole('user')")
    public String hello2user() {
        return "Hello USER!";
    }

    @GetMapping("/tomas")
    // Rol autorizado
    @PreAuthorize("hasRole('admin')")
    public String hello2admin() {
        return "Hello Tomas ADMIN";
    }
}
