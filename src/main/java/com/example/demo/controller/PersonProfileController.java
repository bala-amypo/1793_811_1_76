package com.example.demo.controller;

import com.example.demo.model.PersonProfile;
import com.example.demo.service.PersonProfileService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
@Tag(name = "Person Profile")
public class PersonProfileController {

    @Autowired
    private PersonProfileService service;

    @PostMapping
    public PersonProfile create(@RequestBody PersonProfile person) {
        return service.create(person);
    }

    @GetMapping("/{id}")
    public PersonProfile getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<PersonProfile> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}/relationship-declared")
    public PersonProfile updateDeclared(@PathVariable Long id,
                                        @RequestParam boolean declared) {
        return service.updateRelationshipDeclared(id, declared);
    }

    @GetMapping("/lookup/{referenceId}")
    public PersonProfile getByReference(@PathVariable String referenceId) {
        return service.getByReferenceId(referenceId);
    }
}
