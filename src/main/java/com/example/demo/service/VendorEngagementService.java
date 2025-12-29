package com.example.demo.service;

import com.example.demo.model.VendorEngagement;
import java.util.List;

public interface VendorEngagementService {

    VendorEngagement create(VendorEngagement engagement);

    VendorEngagement getById(Long id);

    List<VendorEngagement> getAll();

    void delete(Long id);
}
