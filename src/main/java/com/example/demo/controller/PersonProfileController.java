package com.example.demo.controller;

import com.example.demo.model.PersonProfile;
import com.example.demo.service.PersonProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonProfileController {

    private final PersonProfileService service;

    public PersonProfileController(PersonProfileService service) {
        this.service = service;
    }

    // Used in test36
    @PostMapping
    public ResponseEntity<PersonProfile> create(@RequestBody PersonProfile p) {
        PersonProfile saved = service.createPerson(p);
        return ResponseEntity.ok(saved);
    }

    // Used in test57
    @GetMapping("/lookup/{referenceId}")
    public ResponseEntity<PersonProfile> lookup(@PathVariable String referenceId) {
        Optional<PersonProfile> opt = service.findByReferenceId(referenceId);
        return opt.map(ResponseEntity::ok)
                  .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
