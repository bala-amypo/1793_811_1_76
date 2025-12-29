package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.VendorEngagement;
import com.example.demo.service.VendorEngagementService;

@Service
public class VendorEngagementServiceImpl implements VendorEngagementService {

    @Override
    public VendorEngagement create(VendorEngagement engagement) {
        return engagement;
    }

    @Override
    public VendorEngagement getById(Long id) {
        return new VendorEngagement();
    }

    @Override
    public List<VendorEngagement> getAll() {
        return new ArrayList<>();
    }

    @Override
    public void delete(Long id) {
        // no-op
    }
}
