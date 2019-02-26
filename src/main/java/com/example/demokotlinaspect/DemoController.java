package com.example.demokotlinaspect;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/")
    public ResponseEntity<?> get() {
        demoService.annotated();
        return ResponseEntity.ok("OK");
    }
}
