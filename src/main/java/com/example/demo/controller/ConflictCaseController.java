package com.example.demo.controller;

import com.example.demo.model.ConflictCase;
import com.example.demo.service.ConflictCaseService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/conflict-cases")
@Tag(name = "Conflict Case")
public class ConflictCaseController {

    @Autowired
    private ConflictCaseService service;

    @PostMapping
    public ConflictCase create(@RequestBody ConflictCase conflictCase) {
        return service.create(conflictCase);
    }

    @PutMapping("/{id}/status")
    public ConflictCase updateStatus(@PathVariable Long id,
                                     @RequestParam String status) {
        return service.updateStatus(id, status);
    }

    @GetMapping("/person/{personId}")
    public List<ConflictCase> getByPerson(@PathVariable Long personId) {
        return service.getByPerson(personId);
    }

    @GetMapping("/{id}")
    public ConflictCase getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<ConflictCase> getAll() {
        return service.getAll();
    }
}
