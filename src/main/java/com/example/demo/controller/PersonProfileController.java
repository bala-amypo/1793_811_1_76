package com.example.demo.controller;

import com.example.demo.model.PersonProfile;
import com.example.demo.service.PersonProfileService;
import org.springframework.http.*;

public class PersonProfileController {

    private final PersonProfileService service;

    public PersonProfileController(PersonProfileService service) {
        this.service = service;
    }

    public ResponseEntity<PersonProfile> create(PersonProfile p) {
        return ResponseEntity.ok(service.createPerson(p));
    }

    public ResponseEntity<PersonProfile> lookup(String ref) {
        return service.findByReferenceId(ref)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
