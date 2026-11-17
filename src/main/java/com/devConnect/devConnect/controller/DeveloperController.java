package com.devConnect.devConnect.controller;


import com.devConnect.devConnect.model.developer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/v1/developers")
public class DeveloperController {

    private final Map<Long, developer> developerStore = new ConcurrentHashMap<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    @GetMapping("/{id}")
    public developer getDeveloperById(@PathVariable Long id) {
        return new developer();
    }

    @GetMapping("/{skill1}/{skill2}")
    public List<developer> getDevelopersBySkills(@PathVariable String skill1, @PathVariable String skill2) {
        return new ArrayList<>();
    }

    // GET /api/v1/developes/search?skill=Java&city=Bangalore&count=15
    @GetMapping("/search")
    public List<developer> getDevelopersBySkillAndLocation(
            @RequestParam String skill,
            @RequestParam(required = false) String city,
            @RequestParam(defaultValue = "10") int count) {
        return new ArrayList<>();
    }


    // Body: {"name":"Riya","email":"riya@test.com","skills":["Java"]}
    @PostMapping
    public developer createDeveloper(@RequestBody developer developer) {
        System.out.println(developer.getName());
        System.out.println(developer.getEmail());

        return developer;
    }
}
