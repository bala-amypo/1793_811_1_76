package com.example.demo.service;

import java.util.List;
import com.example.demo.model.ConflictCase;

public interface ConflictCaseService {

    ConflictCase create(ConflictCase conflictCase);

    ConflictCase updateStatus(Long id, String status);

    List<ConflictCase> getByPerson(Long personId);

    ConflictCase getById(Long id);

    List<ConflictCase> getAll();
}
