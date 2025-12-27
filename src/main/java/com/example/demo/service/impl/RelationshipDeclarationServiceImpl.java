package com.example.demo.service.impl;

import com.example.demo.model.RelationshipDeclaration;
import com.example.demo.service.RelationshipDeclarationService;
import org.springframework.stereotype.Service;

@Service
public class RelationshipDeclarationServiceImpl
        implements RelationshipDeclarationService {

    public RelationshipDeclaration declareRelationship(RelationshipDeclaration r) {
        return r;
    }
}
