package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class ConflictCase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long personId;
    private String status; // OPEN / CLOSED

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getPersonId() { return personId; }
    public void setPersonId(Long personId) { this.personId = personId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
