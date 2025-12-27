package com.example.demo.service.impl;

import com.example.demo.model.VendorEngagementRecord;
import com.example.demo.repository.VendorEngagementRecordRepository;
import com.example.demo.repository.PersonProfileRepository;
import com.example.demo.service.VendorEngagementService;

import java.util.List;

public class VendorEngagementServiceImpl implements VendorEngagementService {

    private final VendorEngagementRecordRepository repo;
    private final PersonProfileRepository personRepo;

    public VendorEngagementServiceImpl(
            VendorEngagementRecordRepository repo,
            PersonProfileRepository personRepo) {
        this.repo = repo;
        this.personRepo = personRepo;
    }

    @Override
    public List<VendorEngagementRecord> getEngagementsByEmployee(long empId) {
        return repo.findByEmployeeId(empId);
    }
}
