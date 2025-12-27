package com.example.demo.repository;

import com.example.demo.model.*;
import java.util.*;

public interface RelationshipDeclarationRepository {
    Optional<RelationshipDeclaration> findById(Long id);
    List<RelationshipDeclaration> findAll();
    RelationshipDeclaration save(RelationshipDeclaration d);
}

