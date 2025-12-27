package com.example.demo.service.impl;

import com.example.demo.model.VendorEngagementRecord;
import com.example.demo.service.VendorEngagementService;
import java.util.*;

public class VendorEngagementServiceImpl
        implements VendorEngagementService {

    private final List<VendorEngagementRecord> store = new ArrayList<>();

    @Override
    public List<VendorEngagementRecord> getEngagementsByEmployee(long empId) {
        return store;
    }

    @Override
    public List<VendorEngagementRecord> getAllEngagements() {
        return store;
    }
}
