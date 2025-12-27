package com.example.demo.service.impl;

import com.example.demo.model.ConflictCase;
import com.example.demo.service.ConflictCaseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConflictCaseServiceImpl implements ConflictCaseService {

    @Override
    public ConflictCase create(ConflictCase conflictCase) {
        return conflictCase;
    }

    @Override
    public ConflictCase updateStatus(Long id, String status) {
        return null;
    }

    @Override
    public List<ConflictCase> getByPerson(Long personId) {
        return new ArrayList<>();
    }

    @Override
    public ConflictCase getById(Long id) {
        return null;
    }

    @Override
    public List<ConflictCase> getAll() {
        return new ArrayList<>();
    }
}
