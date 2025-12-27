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

    public ConflictCase createCase(ConflictCase c) { return c; }
    public List<ConflictCase> getAllCases() { return List.of(); }
}
