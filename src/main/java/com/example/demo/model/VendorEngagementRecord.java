package com.example.demo.model;

public record VendorEngagementRecord(
        Long id,
        Long employeeId,
        String vendorName,
        String role
) {}
