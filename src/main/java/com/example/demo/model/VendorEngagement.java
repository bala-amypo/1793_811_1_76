package com.example.demo.model;

public class VendorEngagementRecord {

    private Long id;
    private Long employeeId;
    private String vendorName;
    private String role;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getEmployeeId() { return employeeId; }
    public void setEmployeeId(Long employeeId) { this.employeeId = employeeId; }

    public String getVendorName() { return vendorName; }
    public void setVendorName(String vendorName) { this.vendorName = vendorName; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
