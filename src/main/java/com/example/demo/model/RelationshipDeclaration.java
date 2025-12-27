package com.example.demo.model;

public class RelationshipDeclaration {

    private Long id;
    private Long personId;
    private Long relatedPersonId;
    private String relationshipType;
    private String status;

    public RelationshipDeclaration() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getRelatedPersonId() {
        return relatedPersonId;
    }

    public void setRelatedPersonId(Long relatedPersonId) {
        this.relatedPersonId = relatedPersonId;
    }

    public String getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
