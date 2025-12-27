package com.example.demo.service;

import com.example.demo.model.RelationshipDeclaration;
import java.util.List;

public interface RelationshipDeclarationService {

    RelationshipDeclaration declareRelationship(RelationshipDeclaration d);

    RelationshipDeclaration verifyDeclaration(long id, boolean verified);

    List<RelationshipDeclaration> getAllDeclarations();
}
