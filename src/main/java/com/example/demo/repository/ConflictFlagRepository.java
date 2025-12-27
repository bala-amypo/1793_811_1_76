package com.example.demo.repository;

import com.example.demo.model.*;
import java.util.*;

public interface ConflictFlagRepository {
    Optional<ConflictFlag> findById(Long id);
    List<ConflictFlag> findByCaseId(Long caseId);
    List<ConflictFlag> findAll();
    ConflictFlag save(ConflictFlag f);
}

