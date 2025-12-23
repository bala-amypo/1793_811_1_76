package com.example.demo.controller;

import com.example.demo.model.RelationshipDeclaration;
import com.example.demo.service.RelationshipDeclarationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "RelationshipDeclaration", description = "Manage relationship declarations")
@RestController
@RequestMapping("/api/relationships")
public class RelationshipDeclarationController {

    @Autowired
    private RelationshipDeclarationService relationshipDeclarationService;

    // POST /api/relationships - declare a relationship
    @PostMapping
    public ResponseEntity<RelationshipDeclaration> declareRelationship(@RequestBody RelationshipDeclaration declaration) {
        RelationshipDeclaration created = relationshipDeclarationService.declareRelationship(declaration);
        return ResponseEntity.ok(created);
    }

    // GET /api/relationships/person/{personId} - get declarations for a person
    @GetMapping("/person/{personId}")
    public ResponseEntity<List<RelationshipDeclaration>> getDeclarationsByPersonId(@PathVariable Long personId) {
        List<RelationshipDeclaration> declarations = relationshipDeclarationService.getDeclarationsByPersonId(personId);
        return ResponseEntity.ok(declarations);
    }

    // PUT /api/relationships/{id}/verify - verify or reject declaration (pass boolean in request param)
    @PutMapping("/{id}/verify")
    public ResponseEntity<RelationshipDeclaration> verifyDeclaration(
            @PathVariable Long id,
            @RequestParam Boolean isVerified) {
        RelationshipDeclaration updated = relationshipDeclarationService.verifyDeclaration(id, isVerified);
        return ResponseEntity.ok(updated);
    }

    // GET /api/relationships - list all relationship declarations
    @GetMapping
    public ResponseEntity<List<RelationshipDeclaration>> getAllDeclarations() {
        List<RelationshipDeclaration> all = relationshipDeclarationService.getAllDeclarations();
        return ResponseEntity.ok(all);
    }
}
