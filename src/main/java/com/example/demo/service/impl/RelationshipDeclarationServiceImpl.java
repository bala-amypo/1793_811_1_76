package com.example.demo.service.impl;

import com.example.demo.exception.ApiException;
import com.example.demo.model.RelationshipDeclaration;
import com.example.demo.repository.PersonProfileRepository;
import com.example.demo.repository.RelationshipDeclarationRepository;
import com.example.demo.service.RelationshipDeclarationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RelationshipDeclarationServiceImpl implements RelationshipDeclarationService {

    private final RelationshipDeclarationRepository repository;
    private final PersonProfileRepository personRepository;

    public RelationshipDeclarationServiceImpl(RelationshipDeclarationRepository repository,
                                              PersonProfileRepository personRepository) {
        this.repository = repository;
        this.personRepository = personRepository;
    }

    public RelationshipDeclaration declareRelationship(RelationshipDeclaration declaration) {
        personRepository.findById(declaration.getPersonId())
                .orElseThrow(() -> new ApiException("person not found"));
        return repository.save(declaration);
    }

    public List<RelationshipDeclaration> getDeclarationsByPerson(Long personId) {
        return repository.findAll().stream()
                .filter(d -> d.getPersonId().equals(personId))
                .collect(Collectors.toList());
    }

    public RelationshipDeclaration verifyDeclaration(Long id, boolean verified) {
        RelationshipDeclaration d = repository.findById(id)
                .orElseThrow(() -> new ApiException("person not found"));
        d.setIsVerified(verified);
        return repository.save(d);
    }

    public List<RelationshipDeclaration> getAllDeclarations() {
        return repository.findAll();
    }
}
