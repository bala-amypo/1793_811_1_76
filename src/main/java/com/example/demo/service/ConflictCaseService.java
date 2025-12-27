package com.example.demo.service;

import com.example.demo.model.ConflictCase;

public interface ConflictCaseService {

    ConflictCase createCase(ConflictCase c);

    ConflictCase updateCaseStatus(long id, String status);
}
