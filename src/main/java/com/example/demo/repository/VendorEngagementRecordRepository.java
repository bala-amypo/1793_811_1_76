package com.example.demo.repository;

import com.example.demo.model.VendorEngagement;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VendorEngagementRecordRepository {

    public VendorEngagement save(VendorEngagement record) {
        return record;
    }

    public VendorEngagement findById(Long id) {
        return null;
    }

    public List<VendorEngagement> findAll() {
        return List.of();
    }
}
