package com.example.demo.controller;

import com.example.demo.model.RelationshipDeclaration;
import com.example.demo.service.RelationshipDeclarationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/relationships")
public class RelationshipDeclarationController {

    private final RelationshipDeclarationService service;

    public RelationshipDeclarationController(RelationshipDeclarationService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<RelationshipDeclaration> declare(
            @RequestBody RelationshipDeclaration d) {
        return ResponseEntity.ok(service.declareRelationship(d));
    }

    @PutMapping("/{id}/verify")
    public ResponseEntity<RelationshipDeclaration> verify(
            @PathVariable Long id,
            @RequestParam boolean verified) {
        return ResponseEntity.ok(service.verifyDeclaration(id, verified));
    }

    @GetMapping
    public ResponseEntity<List<RelationshipDeclaration>> listAll() {
        return ResponseEntity.ok(service.getAllDeclarations());
    }
}
