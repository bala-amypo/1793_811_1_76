package com.example.demo.service;

import java.util.List;
import com.example.demo.model.VendorEngagement;

public interface VendorEngagementService {

    VendorEngagement create(VendorEngagement engagement);

    VendorEngagement getById(Long id);

    List<VendorEngagement> getAll();

    void delete(Long id);
}
