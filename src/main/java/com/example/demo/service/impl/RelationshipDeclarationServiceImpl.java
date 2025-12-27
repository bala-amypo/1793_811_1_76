package com.example.demo.service.impl;

import com.example.demo.repository.RelationshipDeclarationRepository;
import com.example.demo.repository.PersonProfileRepository;
import com.example.demo.model.RelationshipDeclaration;
import com.example.demo.service.RelationshipDeclarationService;

public class RelationshipDeclarationServiceImpl implements RelationshipDeclarationService {

    private final RelationshipDeclarationRepository repo;
    private final PersonProfileRepository personRepo;

    public RelationshipDeclarationServiceImpl(
            RelationshipDeclarationRepository repo,
            PersonProfileRepository personRepo) {
        this.repo = repo;
        this.personRepo = personRepo;
    }

    @Override
    public RelationshipDeclaration declareRelationship(RelationshipDeclaration d) {
        return repo.save(d);
    }
}
