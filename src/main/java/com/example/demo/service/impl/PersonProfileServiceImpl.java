package com.example.demo.service.impl;

import com.example.demo.model.PersonProfile;
import com.example.demo.repository.PersonProfileRepository;
import com.example.demo.service.PersonProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonProfileServiceImpl implements PersonProfileService {

    public PersonProfileServiceImpl(PersonProfileRepository repo) {
    }

    public PersonProfile create(PersonProfile person) {
        return person;
    }

    public PersonProfile getById(Long id) {
        return null;
    }

    public List<PersonProfile> getAll() {
        return List.of();
    }

    public PersonProfile updateRelationshipDeclared(Long id, boolean declared) {
        return null;
    }

    public PersonProfile getByReferenceId(String refId) {
        return null;
    }
}
