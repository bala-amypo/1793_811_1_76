package com.example.demo.service.impl;

import com.example.demo.model.PersonProfile;
import com.example.demo.repository.PersonProfileRepository;
import com.example.demo.service.PersonProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonProfileServiceImpl implements PersonProfileService {

    @Autowired
    private PersonProfileRepository repository;

    @Override
    public PersonProfile create(PersonProfile person) {
        return repository.save(person);
    }

    @Override
    public PersonProfile getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public PersonProfile getByReferenceId(String referenceId) {
        return repository.findByReferenceId(referenceId).orElseThrow();
    }

    @Override
    public List<PersonProfile> getAll() {
        return repository.findAll();
    }

    @Override
    public PersonProfile updateRelationshipDeclared(Long id, boolean declared) {
        PersonProfile p = getById(id);
        p.setRelationshipDeclared(declared);
        return repository.save(p);
    }
}
