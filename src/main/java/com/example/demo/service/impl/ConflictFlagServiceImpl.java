package com.example.demo.service;

import java.util.List;
import com.example.demo.model.ConflictFlag;

public interface ConflictFlagService {

    ConflictFlag create(ConflictFlag flag);

    List<ConflictFlag> getByCase(Long caseId);

    ConflictFlag getById(Long id);

    List<ConflictFlag> getAll();
}
