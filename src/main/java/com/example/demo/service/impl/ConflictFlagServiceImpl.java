package com.example.demo.service.impl;

import com.example.demo.model.ConflictFlag;
import com.example.demo.service.ConflictFlagService;
import java.util.*;

public class ConflictFlagServiceImpl implements ConflictFlagService {

    private final List<ConflictFlag> store = new ArrayList<>();

    @Override
    public ConflictFlag addFlag(ConflictFlag flag) {
        store.add(flag);
        return flag;
    }

    @Override
    public List<ConflictFlag> getFlagsByCase(long caseId) {
        return store;
    }
}
