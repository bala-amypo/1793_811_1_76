package com.example.demo.service.impl;

import com.example.demo.model.PersonProfile;
import com.example.demo.repository.PersonProfileRepository;
import com.example.demo.service.PersonProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonProfileServiceImpl implements PersonProfileService {

    private final PersonProfileRepository personProfileRepository;

    // ✅ REQUIRED constructor (tests use this)
    public PersonProfileServiceImpl(PersonProfileRepository personProfileRepository) {
        this.personProfileRepository = personProfileRepository;
    }

    @Override
    public PersonProfile createPerson(PersonProfile person) {
        return personProfileRepository.save(person);
    }

    @Override
    public PersonProfile getPersonById(long id) {
        return personProfileRepository.findById(id).orElse(null);
    }

    @Override
    public PersonProfile findByReferenceId(String referenceId) {
        return personProfileRepository.findByReferenceId(referenceId).orElse(null);
    }

    @Override
    public List<PersonProfile> getAllPersons() {
        return personProfileRepository.findAll();
    }
}
