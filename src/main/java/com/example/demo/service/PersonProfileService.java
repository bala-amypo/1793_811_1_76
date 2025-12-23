package com.example.demo.service;

import com.example.demo.exception.ApiException;
import com.example.demo.model.PersonProfile;

import java.util.List;

public interface PersonProfileService {

    PersonProfile createPerson(PersonProfile person) throws ApiException;

    PersonProfile getPersonById(Long id) throws ApiException;

    List<PersonProfile> getAllPersons();

    PersonProfile findByReferenceId(String referenceId) throws ApiException;

    PersonProfile updateRelationshipDeclared(Long id, boolean declared) throws ApiException;
}
