package com.example.demo.service.impl;

import com.example.demo.exception.ApiException;
import com.example.demo.model.VendorEngagementRecord;
import com.example.demo.repository.PersonProfileRepository;
import com.example.demo.repository.VendorEngagementRecordRepository;
import com.example.demo.service.VendorEngagementService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorEngagementServiceImpl implements VendorEngagementService {

    private final VendorEngagementRecordRepository repository;
    private final PersonProfileRepository personRepository;

    public VendorEngagementServiceImpl(VendorEngagementRecordRepository repository,
                                       PersonProfileRepository personRepository) {
        this.repository = repository;
        this.personRepository = personRepository;
    }

    public VendorEngagementRecord addEngagement(VendorEngagementRecord record) {
        personRepository.findById(record.getEmployeeId())
                .orElseThrow(() -> new ApiException("person not found"));
        personRepository.findById(record.getVendorId())
                .orElseThrow(() -> new ApiException("person not found"));
        return repository.save(record);
    }

    public List<VendorEngagementRecord> getEngagementsByEmployee(Long employeeId) {
        return repository.findByEmployeeId(employeeId);
    }

    public List<VendorEngagementRecord> getEngagementsByVendor(Long vendorId) {
        return repository.findByVendorId(vendorId);
    }

    public List<VendorEngagementRecord> getAllEngagements() {
        return repository.findAll();
    }
}
