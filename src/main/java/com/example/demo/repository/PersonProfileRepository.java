package com.example.demo.repository;

import com.example.demo.model.*;
import java.util.*;

public interface PersonProfileRepository {
    Optional<PersonProfile> findById(Long id);
    Optional<PersonProfile> findByEmail(String email);
    Optional<PersonProfile> findByReferenceId(String ref);
    List<PersonProfile> findAll();
    PersonProfile save(PersonProfile p);
}
