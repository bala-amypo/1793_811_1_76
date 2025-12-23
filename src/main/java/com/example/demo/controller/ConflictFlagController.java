package com.example.demo.controller;

import com.example.demo.model.ConflictFlag;
import com.example.demo.service.ConflictFlagService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "ConflictFlag", description = "Manage conflict flags")
@RestController
@RequestMapping("/api/conflict-flags")
public class ConflictFlagController {

    @Autowired
    private ConflictFlagService conflictFlagService;

    // POST /api/conflict-flags - add conflict flag
    @PostMapping
    public ResponseEntity<ConflictFlag> addConflictFlag(@RequestBody ConflictFlag conflictFlag) {
        ConflictFlag created = conflictFlagService.addConflictFlag(conflictFlag);
        return ResponseEntity.ok(created);
    }

    // GET /api/conflict-flags/case/{caseId} - get all flags for a conflict case
    @GetMapping("/case/{caseId}")
    public ResponseEntity<List<ConflictFlag>> getFlagsByCase(@PathVariable Long caseId) {
        List<ConflictFlag> flags = conflictFlagService.getFlagsByCaseId(caseId);
        return ResponseEntity.ok(flags);
    }

    // GET /api/conflict-flags/{id} - get conflict flag by ID
    @GetMapping("/{id}")
    public ResponseEntity<ConflictFlag> getFlagById(@PathVariable Long id) {
        ConflictFlag flag = conflictFlagService.getFlagById(id);
        return ResponseEntity.ok(flag);
    }

    // GET /api/conflict-flags - list all conflict flags
    @GetMapping
    public ResponseEntity<List<ConflictFlag>> getAllFlags() {
        List<ConflictFlag> all = conflictFlagService.getAllFlags();
        return ResponseEntity.ok(all);
    }
}
