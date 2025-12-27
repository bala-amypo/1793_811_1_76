package com.example.demo.service.impl;

import com.example.demo.model.VendorEngagement;
import com.example.demo.repository.VendorEngagementRepository;
import com.example.demo.service.VendorEngagementService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorEngagementServiceImpl implements VendorEngagementService {

    private final VendorEngagementRepository repository;

    public VendorEngagementServiceImpl(VendorEngagementRepository repository) {
        this.repository = repository;
    }

    @Override
    public VendorEngagement create(VendorEngagement engagement) {
        return repository.save(engagement);
    }

    @Override
    public VendorEngagement getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<VendorEngagement> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
