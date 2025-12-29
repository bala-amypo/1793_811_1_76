package com.example.demo.repository;

import com.example.demo.model.*;
import java.util.*;

public interface VendorEngagementRepository {
    List<VendorEngagementRecord> findByEmployeeId(Long id);
    List<VendorEngagementRecord> findByVendorId(Long id);
    List<VendorEngagementRecord> findAll();
    VendorEngagementRecord save(VendorEngagementRecord v);
}

