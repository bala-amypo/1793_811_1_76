package com.example.demo.service.impl;

import com.example.demo.model.ConflictCase;
import com.example.demo.repository.ConflictCaseRepository;
import com.example.demo.service.ConflictCaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConflictCaseServiceImpl implements ConflictCaseService {

    public ConflictCaseServiceImpl(ConflictCaseRepository repo) {
    }

    public ConflictCase create(ConflictCase conflictCase) {
        return conflictCase;
    }

    public ConflictCase updateStatus(Long id, String status) {
        return null;
    }

    public List<ConflictCase> getByPerson(Long personId) {
        return List.of();
    }

    public ConflictCase getById(Long id) {
        return null;
    }

    public List<ConflictCase> getAll() {
        return List.of();
    }
}
