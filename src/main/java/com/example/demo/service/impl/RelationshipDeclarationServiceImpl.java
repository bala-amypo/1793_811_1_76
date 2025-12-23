package com.example.demo.service.impl;

import com.example.demo.model.RelationshipDeclaration;
import com.example.demo.repository.RelationshipDeclarationRepository;
import com.example.demo.service.RelationshipDeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationshipDeclarationServiceImpl
        implements RelationshipDeclarationService {

    @Autowired
    private RelationshipDeclarationRepository repository;

    @Override
    public RelationshipDeclaration declare(RelationshipDeclaration d) {
        d.setStatus("PENDING");
        return repository.save(d);
    }

    @Override
    public List<RelationshipDeclaration> getByPerson(Long personId) {
        return repository.findByPersonId(personId);
    }

    @Override
    public RelationshipDeclaration verify(Long id, String status) {
        RelationshipDeclaration d = repository.findById(id).orElseThrow();
        d.setStatus(status);
        return repository.save(d);
    }

    @Override
    public List<RelationshipDeclaration> getAll() {
        return repository.findAll();
    }
}
