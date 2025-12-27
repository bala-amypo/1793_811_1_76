package com.example.demo.service;

import com.example.demo.model.PersonProfile;
import java.util.*;

public interface PersonProfileService {

    PersonProfile createPerson(PersonProfile p);

    PersonProfile getPersonById(Long id);

    List<PersonProfile> getAllPersons();

    Optional<PersonProfile> findByReferenceId(String referenceId);

    PersonProfile updateRelationshipDeclared(Long id, boolean declared);
}
