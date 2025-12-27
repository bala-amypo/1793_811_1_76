package com.example.demo.service.impl;

import com.example.demo.model.RelationshipDeclaration;
import com.example.demo.service.RelationshipDeclarationService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RelationshipDeclarationServiceImpl implements RelationshipDeclarationService {

    @Override
    public RelationshipDeclaration declare(RelationshipDeclaration declaration) {
        return declaration;
    }

    @Override
    public List<RelationshipDeclaration> getByPerson(Long personId) {
        return new ArrayList<>();
    }

    @Override
    public RelationshipDeclaration verify(Long declarationId, String status) {
        return null;
    }

    @Override
    public List<RelationshipDeclaration> getAll() {
        return new ArrayList<>();
    }
}
