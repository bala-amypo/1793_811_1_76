package com.example.demo.service;

import com.example.demo.model.VendorEngagementRecord;
import java.util.List;

public interface VendorEngagementService {

    List<VendorEngagementRecord> getEngagementsByEmployee(long empId);

    List<VendorEngagementRecord> getAllEngagements();
}
