package com.example.demo.service.impl;

import com.example.demo.model.ConflictCase;
import com.example.demo.service.ConflictCaseService;

public class ConflictCaseServiceImpl implements ConflictCaseService {

    @Override
    public ConflictCase createCase(ConflictCase c) {
        c.setStatus("OPEN");
        return c;
    }

    @Override
    public ConflictCase updateCaseStatus(long id, String status) {
        ConflictCase c = new ConflictCase();
        c.setStatus(status);
        return c;
    }
}
