package com.example.demo.service.impl;

import com.example.demo.model.ConflictFlag;
import com.example.demo.repository.ConflictFlagRepository;
import com.example.demo.service.ConflictFlagsService;
import org.springframework.stereotype.Service;

@Service
public class ConflictFlagsServiceImpl implements ConflictFlagsService {

    public ConflictFlagsServiceImpl(ConflictFlagRepository repo) {
    }

    public ConflictFlag addFlag(ConflictFlag flag) {
        return flag;
    }
}
