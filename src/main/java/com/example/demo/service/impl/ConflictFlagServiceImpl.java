package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.ConflictFlag;
import com.example.demo.service.ConflictFlagService;

@Service
public class ConflictFlagServiceImpl implements ConflictFlagService {

    @Override
    public ConflictFlag create(ConflictFlag flag) {
        return flag;
    }

    @Override
    public List<ConflictFlag> getByCase(Long caseId) {
        return new ArrayList<>();
    }

    @Override
    public ConflictFlag getById(Long id) {
        return new ConflictFlag();
    }

    @Override
    public List<ConflictFlag> getAll() {
        return new ArrayList<>();
    }
}
