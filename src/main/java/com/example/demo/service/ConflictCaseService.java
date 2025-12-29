package com.example.demo.service;

import com.example.demo.model.ConflictCase;
import java.util.*;

public interface ConflictCaseService {

    ConflictCase create(ConflictCase c);

    ConflictCase updateStatus(Long id, String status);

    List<ConflictCase> getAll();

    List<ConflictCase> getCasesByPerson(Long personId);

    Optional<ConflictCase> getCaseById(Long id);
}
