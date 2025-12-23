package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class ConflictFlag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long caseId;
    private String flag;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getCaseId() { return caseId; }
    public void setCaseId(Long caseId) { this.caseId = caseId; }

    public String getFlag() { return flag; }
    public void setFlag(String flag) { this.flag = flag; }
}
