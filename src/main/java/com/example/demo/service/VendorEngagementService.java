package com.example.demo.service;

import com.example.demo.model.VendorEngagementRecord;
import java.util.List;

public interface VendorEngagementService {

    VendorEngagementRecord create(VendorEngagementRecord record);

    VendorEngagementRecord getById(Long id);

    List<VendorEngagementRecord> getAll();

    void delete(Long id);
}
