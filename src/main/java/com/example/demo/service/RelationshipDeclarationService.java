package com.example.demo.service;

import com.example.demo.model.RelationshipDeclaration;
import java.util.List;

public interface RelationshipDeclarationService {

    RelationshipDeclaration declare(RelationshipDeclaration declaration);
    List<RelationshipDeclaration> getByPerson(Long personId);
    RelationshipDeclaration verify(Long id, String status);
    List<RelationshipDeclaration> getAll();
}
