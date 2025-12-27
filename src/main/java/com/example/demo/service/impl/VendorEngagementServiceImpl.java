package com.example.demo.service.impl;

import com.example.demo.model.VendorEngagementRecord;
import com.example.demo.repository.VendorEngagementRecordRepository;
import com.example.demo.service.VendorEngagementService;
import org.springframework.stereotype.Service;

@Service
public class VendorEngagementServiceImpl implements VendorEngagementService {

    public VendorEngagementServiceImpl(VendorEngagementRecordRepository repo) {
    }

    public VendorEngagementRecord create(VendorEngagementRecord record) {
        return record;
    }
}
