package com.example.demo.repository;

import com.example.demo.model.PersonProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonProfileRepository extends JpaRepository<PersonProfile, Long> {
    PersonProfile findByEmail(String email);
    PersonProfile findByReferenceId(String referenceId);
}
