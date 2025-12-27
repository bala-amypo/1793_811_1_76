package com.example.demo.service;

import com.example.demo.model.PersonProfile;
import java.util.List;
import java.util.Optional;

public interface PersonProfileService {

    PersonProfile createPerson(PersonProfile p);

    PersonProfile getPersonById(long id);

    List<PersonProfile> getAllPersons();

    Optional<PersonProfile> findByReferenceId(String refId);
}
