package com.example.demo.service;

import com.example.demo.model.VendorEngagement;
import java.util.List;

public interface VendorEngagementService {

    VendorEngagement create(VendorEngagement engagement);
    List<VendorEngagement> getByEmployee(Long employeeId);
    List<VendorEngagement> getByVendor(Long vendorId);
    List<VendorEngagement> getAll();
}
