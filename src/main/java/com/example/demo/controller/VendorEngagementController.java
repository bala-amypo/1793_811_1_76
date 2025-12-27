package com.example.demo.controller;

import com.example.demo.model.VendorEngagementRecord;
import com.example.demo.service.VendorEngagementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendor-engagements")
public class VendorEngagementController {

    private final VendorEngagementService service;

    public VendorEngagementController(VendorEngagementService service) {
        this.service = service;
    }

    @PostMapping
    public VendorEngagementRecord create(@RequestBody VendorEngagementRecord record) {
        return service.create(record);
    }

    @GetMapping("/{id}")
    public VendorEngagementRecord getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<VendorEngagementRecord> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
