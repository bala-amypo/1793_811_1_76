package com.example.demo.model;

public class RelationshipDeclaration {

    private Long id;
    private String relationshipDeclared;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRelationshipDeclared() { return relationshipDeclared; }
    public void setRelationshipDeclared(String relationshipDeclared) {
        this.relationshipDeclared = relationshipDeclared;
    }
}
