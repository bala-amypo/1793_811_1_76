package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class PersonProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String referenceId;

    private String name;
    private String email;

    private boolean relationshipDeclared;

   
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getReferenceId() { return referenceId; }
    public void setReferenceId(String referenceId) { this.referenceId = referenceId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isRelationshipDeclared() { return relationshipDeclared; }
    public void setRelationshipDeclared(boolean relationshipDeclared) {
        this.relationshipDeclared = relationshipDeclared;
    }
}
