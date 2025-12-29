package com.example.demo.controller;

import com.example.demo.model.ConflictCase;
import com.example.demo.service.ConflictCaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/conflicts")
public class ConflictCaseController {

    private final ConflictCaseService service;

    public ConflictCaseController(ConflictCaseService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ConflictCase> create(@RequestBody ConflictCase c) {
        return ResponseEntity.ok(service.createCase(c));
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<ConflictCase> updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        return ResponseEntity.ok(service.updateCaseStatus(id, status));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConflictCase> getById(@PathVariable Long id) {
        Optional<ConflictCase> opt = service.getCaseById(id);
        return opt.map(ResponseEntity::ok)
                  .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/person/{personId}")
    public ResponseEntity<List<ConflictCase>> byPerson(
            @PathVariable Long personId) {
        return ResponseEntity.ok(service.getCasesByPerson(personId));
    }

    @GetMapping
    public ResponseEntity<List<ConflictCase>> listAll() {
        return ResponseEntity.ok(service.getAllCases());
    }
}
