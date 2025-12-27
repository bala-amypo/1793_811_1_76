package com.example.demo.service.impl;

import com.example.demo.model.PersonProfile;
import com.example.demo.service.PersonProfileService;
import java.util.*;

public class PersonProfileServiceImpl implements PersonProfileService {

    private final List<PersonProfile> store = new ArrayList<>();

    @Override
    public PersonProfile createPerson(PersonProfile p) {
        store.add(p);
        return p;
    }

    @Override
    public PersonProfile getPersonById(long id) {
        return store.stream().findFirst().orElse(null);
    }

    @Override
    public List<PersonProfile> getAllPersons() {
        return store;
    }

    @Override
    public Optional<PersonProfile> findByReferenceId(String refId) {
        return store.stream().findFirst();
    }
}
