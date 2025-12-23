package com.example.demo.controller;

import com.example.demo.model.VendorEngagement;
import com.example.demo.service.VendorEngagementService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/engagements")
@Tag(name = "Vendor Engagement")
public class VendorEngagementController {

    @Autowired
    private VendorEngagementService service;

    @PostMapping
    public VendorEngagement create(@RequestBody VendorEngagement engagement) {
        return service.create(engagement);
    }

    @GetMapping("/employee/{employeeId}")
    public List<VendorEngagement> byEmployee(@PathVariable Long employeeId) {
        return service.getByEmployee(employeeId);
    }

    @GetMapping("/vendor/{vendorId}")
    public List<VendorEngagement> byVendor(@PathVariable Long vendorId) {
        return service.getByVendor(vendorId);
    }

    @GetMapping
    public List<VendorEngagement> getAll() {
        return service.getAll();
    }
}
