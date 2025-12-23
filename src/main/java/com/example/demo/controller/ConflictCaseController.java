package com.example.demo.controller;

import com.example.demo.model.ConflictCase;
import com.example.demo.service.ConflictCaseService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "ConflictCase", description = "Manage conflict cases")
@RestController
@RequestMapping("/api/conflict-cases")
public class ConflictCaseController {

    @Autowired
    private ConflictCaseService conflictCaseService;

    // POST /api/conflict-cases - create conflict case
    @PostMapping
    public ResponseEntity<ConflictCase> createConflictCase(@RequestBody ConflictCase conflictCase) {
        ConflictCase created = conflictCaseService.createConflictCase(conflictCase);
        return ResponseEntity.ok(created);
    }

    // PUT /api/conflict-cases/{id}/status - update case status
    @PutMapping("/{id}/status")
    public ResponseEntity<ConflictCase> updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        ConflictCase updated = conflictCaseService.updateStatus(id, status);
        return ResponseEntity.ok(updated);
    }

    // GET /api/conflict-cases/person/{personId} - get cases linked to person
    @GetMapping("/person/{personId}")
    public ResponseEntity<List<ConflictCase>> getCasesByPerson(@PathVariable Long personId) {
        List<ConflictCase> cases = conflictCaseService.getCasesByPerson(personId);
        return ResponseEntity.ok(cases);
    }

    // GET /api/conflict-cases/{id} - get conflict case by ID
    @GetMapping("/{id}")
    public ResponseEntity<ConflictCase> getCaseById(@PathVariable Long id) {
        ConflictCase conflictCase = conflictCaseService.getCaseById(id);
        return ResponseEntity.ok(conflictCase);
    }

    // GET /api/conflict-cases - list all conflict cases
    @GetMapping
    public ResponseEntity<List<ConflictCase>> getAllCases() {
        List<ConflictCase> all = conflictCaseService.getAllCases();
        return ResponseEntity.ok(all);
    }
}
