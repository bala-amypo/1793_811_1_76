package com.example.demo.repository;

import com.example.demo.model.VendorEngagementRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VendorEngagementRecordRepository {

    public VendorEngagementRecord save(VendorEngagementRecord record) {
        return record;
    }

    public VendorEngagementRecord findById(Long id) {
        return null;
    }

    public List<VendorEngagementRecord> findAll() {
        return List.of();
    }
}
