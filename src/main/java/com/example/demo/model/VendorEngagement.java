 package com.example.demo.model;

public class VendorEngagement {

    private Long id;
    private Long personId;
    private Long vendorId;
    private String role;

    public VendorEngagement() {
    }

    public VendorEngagement(Long id, Long personId, Long vendorId, String role) {
        this.id = id;
        this.personId = personId;
        this.vendorId = vendorId;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
