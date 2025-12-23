package com.example.demo.controller;

import com.example.demo.model.ConflictFlag;
import com.example.demo.service.ConflictFlagService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/conflict-flags")
@Tag(name = "Conflict Flag")
public class ConflictFlagController {

    @Autowired
    private ConflictFlagService service;

    @PostMapping
    public ConflictFlag create(@RequestBody ConflictFlag flag) {
        return service.create(flag);
    }

    @GetMapping("/case/{caseId}")
    public List<ConflictFlag> getByCase(@PathVariable Long caseId) {
        return service.getByCase(caseId);
    }

    @GetMapping("/{id}")
    public ConflictFlag getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<ConflictFlag> getAll() {
        return service.getAll();
    }
}
