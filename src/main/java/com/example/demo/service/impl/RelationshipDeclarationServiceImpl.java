package com.example.demo.service.impl;

import com.example.demo.model.RelationshipDeclaration;
import com.example.demo.service.RelationshipDeclarationService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RelationshipDeclarationServiceImpl implements RelationshipDeclarationService {

    private final List<RelationshipDeclaration> store = new ArrayList<>();

    @Override
    public RelationshipDeclaration declare(RelationshipDeclaration declaration) {
        declaration.setStatus("PENDING");
        store.add(declaration);
        return declaration;
    }

    @Override
    public List<RelationshipDeclaration> getByPerson(Long personId) {
        return store.stream()
                .filter(d -> d.getPersonId().equals(personId))
                .collect(Collectors.toList());
    }

    @Override
    public RelationshipDeclaration verify(Long id, String status) {
        for (RelationshipDeclaration d : store) {
            if (d.getId().equals(id)) {
                d.setStatus(status);
                return d;
            }
        }
        return null;
    }

    
    @Override
    public List<RelationshipDeclaration> getAll() {
        return store;
    }
}
