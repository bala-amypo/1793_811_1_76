package com.example.demo.controller;

import com.example.demo.model.PersonProfile;
import com.example.demo.service.PersonProfileService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "PersonProfile", description = "Manage person profiles")
@RestController
@RequestMapping("/api/persons")
public class PersonProfileController {

    @Autowired
    private PersonProfileService personProfileService;

    // POST /api/persons - create new person profile
    @PostMapping
    public ResponseEntity<PersonProfile> createPersonProfile(@RequestBody PersonProfile personProfile) {
        PersonProfile created = personProfileService.createPersonProfile(personProfile);
        return ResponseEntity.ok(created);
    }

    // GET /api/persons/{id} - get person by ID
    @GetMapping("/{id}")
    public ResponseEntity<PersonProfile> getPersonById(@PathVariable Long id) {
        PersonProfile person = personProfileService.getPersonById(id);
        return ResponseEntity.ok(person);
    }

    // GET /api/persons - list all persons
    @GetMapping
    public ResponseEntity<List<PersonProfile>> getAllPersons() {
        List<PersonProfile> persons = personProfileService.getAllPersons();
        return ResponseEntity.ok(persons);
    }

    // PUT /api/persons/{id}/relationship-declared - update relationshipDeclared flag
    @PutMapping("/{id}/relationship-declared")
    public ResponseEntity<PersonProfile> updateRelationshipDeclared(
            @PathVariable Long id,
            @RequestParam Boolean relationshipDeclared) {
        PersonProfile updated = personProfileService.updateRelationshipDeclared(id, relationshipDeclared);
        return ResponseEntity.ok(updated);
    }

    // GET /api/persons/lookup/{referenceId} - get person by referenceId
    @GetMapping("/lookup/{referenceId}")
    public ResponseEntity<PersonProfile> getPersonByReferenceId(@PathVariable String referenceId) {
        PersonProfile person = personProfileService.getPersonByReferenceId(referenceId);
        return ResponseEntity.ok(person);
    }
}
