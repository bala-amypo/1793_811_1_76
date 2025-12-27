package com.example.demo.service;

import com.example.demo.model.VendorEngagementRecord;

import java.util.List;

public interface VendorEngagementService {

    VendorEngagementRecord save(VendorEngagementRecord record);

    List<VendorEngagementRecord> getEngagementsByEmployee(long employeeId);

    void delete(Long id);
}
