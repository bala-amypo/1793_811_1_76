package com.example.demo.service.impl;

import com.example.demo.model.RelationshipDeclaration;
import com.example.demo.service.RelationshipDeclarationService;
import java.util.*;

public class RelationshipDeclarationServiceImpl
        implements RelationshipDeclarationService {

    private final List<RelationshipDeclaration> store = new ArrayList<>();

    @Override
    public RelationshipDeclaration declareRelationship(RelationshipDeclaration d) {
        store.add(d);
        return d;
    }

    @Override
    public RelationshipDeclaration verifyDeclaration(long id, boolean verified) {
        RelationshipDeclaration d = store.get(0);
        d.setIsVerified(verified);
        return d;
    }

    @Override
    public List<RelationshipDeclaration> getAllDeclarations() {
        return store;
    }
}
