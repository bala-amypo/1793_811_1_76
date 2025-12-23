package com.example.demo.service.impl;

import com.example.demo.exception.ApiException;
import com.example.demo.model.PersonProfile;
import com.example.demo.repository.PersonProfileRepository;
import com.example.demo.service.PersonProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonProfileServiceImpl implements PersonProfileService {

    @Autowired
    private PersonProfileRepository personProfileRepository;

    @Override
    public PersonProfile createPerson(PersonProfile person) throws ApiException {
        // Check duplicate email
        if (personProfileRepository.existsByEmail(person.getEmail())) {
            throw new ApiException("Email already exists.");
        }
        // Check duplicate referenceId
        if (personProfileRepository.existsByReferenceId(person.getReferenceId())) {
            throw new ApiException("ReferenceId already exists.");
        }
        // Default relationshipDeclared false if not set
        if (person.getRelationshipDeclared() == null) {
            person.setRelationshipDeclared(false);
        }
        return personProfileRepository.save(person);
    }

    @Override
    public PersonProfile getPersonById(Long id) throws ApiException {
        Optional<PersonProfile> optionalPerson = personProfileRepository.findById(id);
        if (optionalPerson.isEmpty()) {
            throw new ApiException("PersonProfile not found with id: " + id);
        }
        return optionalPerson.get();
    }

    @Override
    public List<PersonProfile> getAllPersons() {
        return personProfileRepository.findAll();
    }

    @Override
    public PersonProfile findByReferenceId(String referenceId) throws ApiException {
        Optional<PersonProfile> optionalPerson = personProfileRepository.findByReferenceId(referenceId);
        if (optionalPerson.isEmpty()) {
            throw new ApiException("PersonProfile not found with referenceId: " + referenceId);
        }
        return optionalPerson.get();
    }

    @Override
    public PersonProfile updateRelationshipDeclared(Long id, boolean declared) throws ApiException {
        PersonProfile person = getPersonById(id);
        person.setRelationshipDeclared(declared);
        return personProfileRepository.save(person);
    }
}
