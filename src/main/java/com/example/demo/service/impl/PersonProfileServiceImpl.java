package com.example.demo.service.impl;

import com.example.demo.model.PersonProfile;
import com.example.demo.repository.PersonProfileRepository;
import com.example.demo.service.PersonProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonProfileServiceImpl implements PersonProfileService {

    private final PersonProfileRepository repository;

    public PersonProfileServiceImpl(PersonProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public PersonProfile create(PersonProfile person) {
        return repository.save(person);
    }

    @Override
    public PersonProfile getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<PersonProfile> getAll() {
        return repository.findAll();
    }

    @Override
    public PersonProfile updateRelationshipDeclared(Long id, boolean declared) {
        PersonProfile person = repository.findById(id).orElse(null);
        if (person != null) {
            person.setRelationshipDeclared(declared);
            return repository.save(person);
        }
        return null;
    }

    @Override
    public PersonProfile getByReferenceId(String referenceId) {
        return repository.findByReferenceId(referenceId);
    }
}
