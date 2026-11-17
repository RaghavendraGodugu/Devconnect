package com.devConnect.devConnect.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String health(){return "Devconnect backend is live now";}

    @GetMapping("/api/v1/status")
    public Map<String, Object> status() {
        Map<String, Object> map = new HashMap<>();
        map.put("Service", "DevConnect");
        map.put("Status", "Running");
        map.put("Version", "1.0.0");
        map.put("Timestamp", LocalDateTime.now().toString());
        return map;
    }
}
