package com.example.demo.repository;

import com.example.demo.model.VendorEngagement;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VendorEngagementRepository {

    VendorEngagement save(VendorEngagement engagement);

    Optional<VendorEngagement> findById(Long id);

    List<VendorEngagement> findAll();

    void deleteById(Long id);
}
