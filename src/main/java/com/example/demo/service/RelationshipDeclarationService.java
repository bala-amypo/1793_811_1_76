package com.example.demo.service;

import com.example.demo.model.RelationshipDeclaration;
import java.util.*;

public interface RelationshipDeclarationService {

    RelationshipDeclaration declareRelationship(RelationshipDeclaration d);

    RelationshipDeclaration verifyDeclaration(Long id, boolean verified);

    List<RelationshipDeclaration> getAllDeclarations();
}
