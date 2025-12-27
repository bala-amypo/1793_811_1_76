package com.example.demo.model;

public record VendorEngagementRecord(
        Long id,
        Long personId,
        String vendorName,
        String engagementType
) {
}
