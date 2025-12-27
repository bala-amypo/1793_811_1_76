package com.example.demo.model;

public class ConflictFlag {

    private Long id;
    private Long conflictCaseId;
    private String reason;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getConflictCaseId() {
        return conflictCaseId;
    }

    public void setConflictCaseId(Long conflictCaseId) {
        this.conflictCaseId = conflictCaseId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
