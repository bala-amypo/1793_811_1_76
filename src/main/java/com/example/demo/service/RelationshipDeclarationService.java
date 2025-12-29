package com.example.demo.service;

import java.util.List;
import com.example.demo.model.RelationshipDeclaration;

public interface RelationshipDeclarationService {

    RelationshipDeclaration declare(RelationshipDeclaration declaration);

    List<RelationshipDeclaration> getByPerson(Long personId);

    RelationshipDeclaration verify(Long id, String status);

    List<RelationshipDeclaration> getAll();
}
