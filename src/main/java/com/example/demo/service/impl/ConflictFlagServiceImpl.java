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
    private ConflictFlagRepository flagRepository;

    @Override
    public ConflictFlag addFlag(ConflictFlag flag) {
        return flagRepository.save(flag);
    }

    @Override
    public List<ConflictFlag> getFlagsByCase(Long caseId) {
        return flagRepository.findByCaseId(caseId);
    }

    @Override
    public ConflictFlag getFlagById(Long id) {
        return flagRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Conflict flag not found with id: " + id));
    }

    @Override
    public List<ConflictFlag> getAllFlags() {
        return flagRepository.findAll();
    }
}
