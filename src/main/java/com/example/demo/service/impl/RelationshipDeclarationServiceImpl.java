package com.example.demo.service.impl;

import com.example.demo.model.RelationshipDeclaration;
import com.example.demo.service.RelationshipDeclarationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationshipDeclarationServiceImpl
        implements RelationshipDeclarationService {

    public RelationshipDeclaration declare(RelationshipDeclaration declaration) {
        return declaration;
    }

    public List<RelationshipDeclaration> getByPerson(Long personId) {
        return List.of();
    }

    public RelationshipDeclaration verify(Long id, String status) {
        return null;
    }

    public List<RelationshipDeclaration> getAll() {
        return List.of();
    }
}
