package com.example.demo.controller;

import com.example.demo.model.VendorEngagement;
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
    public VendorEngagement create(@RequestBody VendorEngagementRecord engagement) {
        return service.create(engagement);
    }

    @GetMapping("/{id}")
    public VendorEngagement getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<VendorEngagement> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
