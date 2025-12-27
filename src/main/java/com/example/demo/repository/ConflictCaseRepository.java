package com.example.demo.repository;

import com.example.demo.model.*;
import java.util.*;

public interface ConflictCaseRepository {
    Optional<ConflictCase> findById(Long id);
    List<ConflictCase> findAll();
    List<ConflictCase> findByPrimaryPersonIdOrSecondaryPersonId(Long a, Long b);
    ConflictCase save(ConflictCase c);
}
