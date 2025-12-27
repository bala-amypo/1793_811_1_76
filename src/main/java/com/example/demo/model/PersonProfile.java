package com.example.demo.model;

public class PersonProfile {

    private Long id;
    private String email;
    private String fullName;
    private String personType;
    private String department;
    private boolean relationshipDeclared;

    public PersonProfile() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getPersonType() { return personType; }
    public void setPersonType(String personType) { this.personType = personType; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public boolean isRelationshipDeclared() { return relationshipDeclared; }
    public void setRelationshipDeclared(boolean relationshipDeclared) {
        this.relationshipDeclared = relationshipDeclared;
    }
}
