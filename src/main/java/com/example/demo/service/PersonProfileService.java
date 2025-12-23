package com.example.demo.service;

import com.example.demo.model.PersonProfile;
import java.util.List;

public interface PersonProfileService {

    PersonProfile create(PersonProfile person);
    PersonProfile getById(Long id);
    PersonProfile getByReferenceId(String referenceId);
    List<PersonProfile> getAll();
    PersonProfile updateRelationshipDeclared(Long id, boolean declared);
}
