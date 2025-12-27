package com.example.demo.service;

import com.example.demo.model.ConflictCase;
import java.util.List;

public interface ConflictCaseService {

    ConflictCase create(ConflictCase conflictCase);

    ConflictCase updateStatus(Long id, String status);

    List<ConflictCase> getByPerson(Long personId);

    ConflictCase getById(Long id);

    List<ConflictCase> getAll();
}
