package com.example.demo.controller;

import com.example.demo.model.RelationshipDeclaration;
import com.example.demo.service.RelationshipDeclarationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/relationships")
@Tag(name = "Relationship Declaration")
public class RelationshipDeclarationController {

    @Autowired
    private RelationshipDeclarationService service;

    @PostMapping
    public RelationshipDeclaration declare(@RequestBody RelationshipDeclaration d) {
        return service.declare(d);
    }

    @GetMapping("/person/{personId}")
    public List<RelationshipDeclaration> getByPerson(@PathVariable Long personId) {
        return service.getByPerson(personId);
    }

    @PutMapping("/{id}/verify")
    public RelationshipDeclaration verify(@PathVariable Long id,
                                          @RequestParam String status) {
        return service.verify(id, status);
    }

    @GetMapping
    public List<RelationshipDeclaration> getAll() {
        return service.getAll();
    }
}
