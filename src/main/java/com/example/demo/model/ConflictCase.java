package com.example.demo.model;

public class ConflictCase {

    private Long id;
    private String severity;
    private String riskLevel;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }

    public String getRiskLevel() { return riskLevel; }
    public void setRiskLevel(String riskLevel) { this.riskLevel = riskLevel; }
}
