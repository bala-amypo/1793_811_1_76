package com.example.demo.model;

public class PersonProfile {

    private Long id;
    private String name;
    private String referenceId;
    private boolean relationshipDeclared;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getReferenceId() { return referenceId; }
    public void setReferenceId(String referenceId) { this.referenceId = referenceId; }

    public boolean getRelationshipDeclared() { return relationshipDeclared; }
    public void setRelationshipDeclared(boolean relationshipDeclared) {
        this.relationshipDeclared = relationshipDeclared;
    }
}
