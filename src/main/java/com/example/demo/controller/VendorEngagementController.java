package com.example.demo.controller;

import com.example.demo.model.VendorEngagementRecord;
import com.example.demo.service.VendorEngagementService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "VendorEngagement", description = "Manage vendor engagements")
@RestController
@RequestMapping("/api/engagements")
public class VendorEngagementController {

    @Autowired
    private VendorEngagementService vendorEngagementService;

    // POST /api/engagements - add vendor engagement
    @PostMapping
    public ResponseEntity<VendorEngagementRecord> addEngagement(@RequestBody VendorEngagementRecord record) {
        VendorEngagementRecord created = vendorEngagementService.addEngagement(record);
        return ResponseEntity.ok(created);
    }

    // GET /api/engagements/employee/{employeeId} - get engagements by employee
    @GetMapping("/employee/{employeeId}")
    public ResponseEntity<List<VendorEngagementRecord>> getByEmployee(@PathVariable Long employeeId) {
        List<VendorEngagementRecord> engagements = vendorEngagementService.getByEmployee(employeeId);
        return ResponseEntity.ok(engagements);
    }

    // GET /api/engagements/vendor/{vendorId} - get engagements by vendor
    @GetMapping("/vendor/{vendorId}")
    public ResponseEntity<List<VendorEngagementRecord>> getByVendor(@PathVariable Long vendorId) {
        List<VendorEngagementRecord> engagements = vendorEngagementService.getByVendor(vendorId);
        return ResponseEntity.ok(engagements);
    }

    // GET /api/engagements - list all engagements
    @GetMapping
    public ResponseEntity<List<VendorEngagementRecord>> getAll() {
        List<VendorEngagementRecord> all = vendorEngagementService.getAll();
        return ResponseEntity.ok(all);
    }
}
