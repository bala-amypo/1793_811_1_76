package com.example.demo.service.impl;

import com.example.demo.model.VendorEngagement;
import com.example.demo.repository.VendorEngagementRecordRepository;
import com.example.demo.service.VendorEngagementService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorEngagementServiceImpl implements VendorEngagementService {

    public VendorEngagementServiceImpl(VendorEngagementRecordRepository repo) {
    }

    public VendorEngagement create(VendorEngagement engagement) {
        return engagement;
    }

    public List<VendorEngagement> getByEmployee(Long employeeId) {
        return List.of();
    }

    public List<VendorEngagement> getByVendor(Long vendorId) {
        return List.of();
    }

    public List<VendorEngagement> getAll() {
        return List.of();
    }
}
