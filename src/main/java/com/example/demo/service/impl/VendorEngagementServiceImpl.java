package com.example.demo.service.impl;

import com.example.demo.model.VendorEngagement;
import com.example.demo.service.VendorEngagementService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VendorEngagementServiceImpl implements VendorEngagementService {

    private final List<VendorEngagement> store = new ArrayList<>();

    @Override
    public VendorEngagement create(VendorEngagement engagement) {
        engagement.setId((long) (store.size() + 1));
        store.add(engagement);
        return engagement;
    }

    @Override
    public VendorEngagement getById(Long id) {
        return store.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<VendorEngagement> getAll() {
        return store;
    }

    @Override
    public void delete(Long id) {
        store.removeIf(e -> e.getId().equals(id));
    }
}
