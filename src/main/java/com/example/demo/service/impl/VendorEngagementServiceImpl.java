package com.example.demo.service.impl;

import com.example.demo.model.VendorEngagement;
import com.example.demo.service.VendorEngagementService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorEngagementServiceImpl implements VendorEngagementService {

    @Override
    public VendorEngagement create(VendorEngagement engagement) {
        return engagement;
    }

    @Override
    public VendorEngagement getById(Long id) {
        return null;
    }

    @Override
    public List<VendorEngagement> getAll() {
        return List.of();
    }

    @Override
    public VendorEngagement update(Long id, VendorEngagement engagement) {
        return engagement;
    }

    @Override
    public void delete(Long id) {
        // no-op
    }
}
