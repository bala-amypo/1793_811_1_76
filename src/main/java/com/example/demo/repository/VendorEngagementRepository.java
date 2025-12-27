package com.example.demo.repository;

import com.example.demo.model.VendorEngagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorEngagementRepository
        extends JpaRepository<VendorEngagement, Long> {
}
