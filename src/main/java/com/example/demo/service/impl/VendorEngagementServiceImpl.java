package com.example.demo.service;

import com.example.demo.model.VendorEngagementRecord;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VendorEngagementServiceImpl implements VendorEngagementService {

    private final List<VendorEngagementRecord> store = new ArrayList<>();

    @Override
    public VendorEngagementRecord create(VendorEngagementRecord record) {
        store.add(record);
        return record;
    }

    @Override
    public VendorEngagementRecord getById(Long id) {
        return store.stream()
                .filter(r -> r.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("VendorEngagement not found"));
    }

    @Override
    public List<VendorEngagementRecord> getAll() {
        return store;
    }

    @Override
    public void delete(Long id) {
        store.removeIf(r -> r.id().equals(id));
    }
}
