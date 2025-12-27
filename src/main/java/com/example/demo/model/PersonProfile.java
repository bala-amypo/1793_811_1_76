package com.example.demo.model;

public class PersonProfile {

    private Long id;
    private String referenceId;
    private String personType;
    private String fullName;
    private String email;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getReferenceId() { return referenceId; }
    public void setReferenceId(String referenceId) { this.referenceId = referenceId; }

    public String getPersonType() { return personType; }
    public void setPersonType(String personType) { this.personType = personType; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
