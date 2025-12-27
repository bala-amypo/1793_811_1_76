package com.example.demo.model;

public class ConflictCase {

    private Long id;
    private Long primaryPersonId;
    private Long secondaryPersonId;
    private String triggerSource;
    private String status;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getPrimaryPersonId() { return primaryPersonId; }
    public void setPrimaryPersonId(Long primaryPersonId) {
        this.primaryPersonId = primaryPersonId;
    }

    public Long getSecondaryPersonId() { return secondaryPersonId; }
    public void setSecondaryPersonId(Long secondaryPersonId) {
        this.secondaryPersonId = secondaryPersonId;
    }

    public String getTriggerSource() { return triggerSource; }
    public void setTriggerSource(String triggerSource) {
        this.triggerSource = triggerSource;
    }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
