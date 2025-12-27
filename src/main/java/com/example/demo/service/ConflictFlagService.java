package com.example.demo.service;

import com.example.demo.model.ConflictFlag;
import java.util.List;

public interface ConflictFlagService {

    ConflictFlag create(ConflictFlag flag);

    List<ConflictFlag> getByCase(Long caseId);

    ConflictFlag getById(Long id);

    List<ConflictFlag> getAll();
}
