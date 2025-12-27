package com.example.demo.service.impl;

import com.example.demo.model.ConflictFlag;
import com.example.demo.service.ConflictFlagService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        return null;
    }

    @Override
    public List<ConflictFlag> getAll() {
        return new ArrayList<>();
    }
}
