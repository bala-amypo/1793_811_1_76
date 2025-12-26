package com.example.demo.service.impl;

import com.example.demo.model.ConflictCase;
import com.example.demo.repository.ConflictCaseRepository;
import com.example.demo.service.ConflictCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConflictCaseServiceImpl implements ConflictCaseService {

    @Autowired
    private ConflictCaseRepository repository;

    @Override
    public ConflictCase create(ConflictCase conflictCase) {
        conflictCase.setStatus("OPEN");
        return repository.save(conflictCase);
    }

    @Override
    public ConflictCase updateStatus(Long id, String status) {
        ConflictCase c = repository.findById(id).orElseThrow();
        c.setStatus(status);
        return repository.save(c);
    }

    @Override
    public List<ConflictCase> getByPerson(Long personId) {
        return repository.findByPersonId(personId);
    }

    @Override
    public ConflictCase getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<ConflictCase> getAll() {
        return repository.findAll();
    }
}
