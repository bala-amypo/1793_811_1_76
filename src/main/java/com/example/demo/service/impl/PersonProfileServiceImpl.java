package com.example.demo.service.impl;

import com.example.demo.model.PersonProfile;
import com.example.demo.service.PersonProfileService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonProfileServiceImpl implements PersonProfileService {

    @Override
    public PersonProfile create(PersonProfile person) {
        return person;
    }

    @Override
    public PersonProfile getById(Long id) {
        return null;
    }

    @Override
    public List<PersonProfile> getAll() {
        return new ArrayList<>();
    }

    @Override
    public PersonProfile updateRelationshipDeclared(Long id, boolean declared) {
        return null;
    }

    @Override
    public PersonProfile getByReferenceId(String referenceId) {
        return null;
    }
}
