package com.example.demo.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.model.RelationshipDeclaration;
import com.example.demo.service.RelationshipDeclarationService;

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
    public RelationshipDeclaration verify(Long id, String status) {
        return new RelationshipDeclaration();
    }

    @Override
    public List<RelationshipDeclaration> getAll() {
        return new ArrayList<>();
    }
}
