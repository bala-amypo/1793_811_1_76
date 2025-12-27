package com.example.demo.service.impl;

import com.example.demo.model.ConflictFlag;
import com.example.demo.repository.ConflictFlagRepository;
import com.example.demo.service.ConflictFlagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConflictFlagServiceImpl implements ConflictFlagService {

    @Autowired
    private ConflictFlagRepository repository;

    @Override
    public ConflictFlag create(ConflictFlag flag) {
        return repository.save(flag);
    }

    @Override
    public List<ConflictFlag> getByCase(Long caseId) {
        return repository.findByCaseId(caseId);
    }

    @Override
    public ConflictFlag getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<ConflictFlag> getAll() {
        return repository.findAll();
    }
}
`