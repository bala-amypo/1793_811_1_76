package com.example.demo.service.impl;

import com.example.demo.model.RelationshipDeclaration;
import com.example.demo.repository.RelationshipDeclarationRepository;
import com.example.demo.service.RelationshipDeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationshipDeclarationServiceImpl implements RelationshipDeclarationService {

    @Autowired
    private RelationshipDeclarationRepository declarationRepository;

    @Override
    public RelationshipDeclaration declareRelationship(RelationshipDeclaration declaration) {
        // isVerified defaults to false if null
        if (declaration.getIsVerified() == null) {
            declaration.setIsVerified(false);
        }
        return declarationRepository.save(declaration);
    }

    @Override
    public List<RelationshipDeclaration> getDeclarationsByPerson(Long personId) {
        return declarationRepository.findByPersonId(personId);
    }

    @Override
    public RelationshipDeclaration verifyDeclaration(Long declarationId, boolean verified) {
        RelationshipDeclaration declaration = declarationRepository.findById(declarationId)
                .orElseThrow(() -> new RuntimeException("Declaration not found with id: " + declarationId));
        declaration.setIsVerified(verified);
        return declarationRepository.save(declaration);
    }

    @Override
    public List<RelationshipDeclaration> getAllDeclarations() {
        return declarationRepository.findAll();
    }
}
