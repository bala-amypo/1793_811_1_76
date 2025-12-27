package com.example.demo.service.impl;

import com.example.demo.model.ConflictFlag;
import com.example.demo.repository.ConflictFlagRepository;
import com.example.demo.service.ConflictFlagService;
import org.springframework.stereotype.Service;

@Service
public class ConflictFlagServiceImpl implements ConflictFlagService {

    public ConflictFlagServiceImpl(ConflictFlagRepository repo) {
    }

    @Override
    public ConflictFlag create(ConflictFlag flag) {
        return flag;
    }
}
