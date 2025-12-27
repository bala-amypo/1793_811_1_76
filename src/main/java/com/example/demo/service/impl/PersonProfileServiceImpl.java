package com.example.demo.service.impl;

import com.example.demo.model.PersonProfile;
import com.example.demo.repository.PersonProfileRepository;
import com.example.demo.service.PersonProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonProfileServiceImpl implements PersonProfileService {

    private final PersonProfileRepository repo;

    public PersonProfileServiceImpl(PersonProfileRepository repo) {
        this.repo = repo;
    }

    public PersonProfile createPerson(PersonProfile p) { return p; }
    public List<PersonProfile> getAllPersons() { return List.of(); }
    public PersonProfile getPersonById(long id) { return null; }
    public PersonProfile findByReferenceId(String refId) { return null; }
}
