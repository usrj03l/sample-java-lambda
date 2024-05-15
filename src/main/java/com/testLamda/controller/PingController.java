package com.testLamda.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;
import java.util.Map;


@RestController
@EnableWebMvc
@RequestMapping
public class PingController {
    @GetMapping("/ping")
    public ResponseEntity ping() {
        Map<String, String> pong = new HashMap<>();
        pong.put("pong", "Hello, World!");
        return ResponseEntity.ok(pong);
    }
}
