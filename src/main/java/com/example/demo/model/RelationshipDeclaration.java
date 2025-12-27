package com.example.demo.model;

public class RelationshipDeclaration {

    private Long id;
    private Long personId;
    private String relatedPersonName;
    private boolean isVerified;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getPersonId() { return personId; }
    public void setPersonId(Long personId) { this.personId = personId; }

    public String getRelatedPersonName() { return relatedPersonName; }
    public void setRelatedPersonName(String relatedPersonName) {
        this.relatedPersonName = relatedPersonName;
    }

    public boolean getIsVerified() { return isVerified; }
    public void setIsVerified(boolean verified) { isVerified = verified; }
}
