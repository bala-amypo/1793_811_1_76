package com.example.demo.service.impl;

import com.example.demo.model.VendorEngagement;
import com.example.demo.repository.VendorEngagementRepository;
import com.example.demo.service.VendorEngagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorEngagementServiceImpl implements VendorEngagementService {

    @Autowired
    private VendorEngagementRepository repository;

    @Override
    public VendorEngagement create(VendorEngagement engagement) {
        return repository.save(engagement);
    }

    @Override
    public List<VendorEngagement> getByEmployee(Long employeeId) {
        return repository.findByEmployeeId(employeeId);
    }

    @Override
    public List<VendorEngagement> getByVendor(Long vendorId) {
        return repository.findByVendorId(vendorId);
    }

    @Override
    public List<VendorEngagement> getAll() {
        return repository.findAll();
    }
}
