package com.example.demo.service;

import com.example.demo.model.PersonProfile;
import java.util.List;

public interface PersonProfileService {
    PersonProfile createPerson(PersonProfile p);
    List<PersonProfile> getAllPersons();
    PersonProfile getPersonById(long id);
    PersonProfile findByReferenceId(String refId);
}
