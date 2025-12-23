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
    private ConflictCaseRepository caseRepository;

    @Override
    public ConflictCase createCase(ConflictCase conflictCase) {
        // Set default status OPEN if null
        if (conflictCase.getStatus() == null) {
            conflictCase.setStatus("OPEN");
        }
        return caseRepository.save(conflictCase);
    }

    @Override
    public ConflictCase updateCaseStatus(Long caseId, String status) {
        ConflictCase conflictCase = caseRepository.findById(caseId)
                .orElseThrow(() -> new RuntimeException("Conflict case not found with id: " + caseId));
        conflictCase.setStatus(status);
        return caseRepository.save(conflictCase);
    }

    @Override
    public List<ConflictCase> getCasesByPerson(Long personId) {
        return caseRepository.findByPrimaryPersonIdOrSecondaryPersonId(personId, personId);
    }

    @Override
    public ConflictCase getCaseById(Long id) {
        return caseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Conflict case not found with id: " + id));
    }

    @Override
    public List<ConflictCase> getAllCases() {
        return caseRepository.findAll();
    }
}
