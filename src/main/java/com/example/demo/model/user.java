package com.example.demo.model;

import jakarta.persistence.*;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(
    neme = "users",
    uniqueConstraints = {
        @uniqueConstraint(columnName = "userName"),
        @uniqueConstrint(columnName = "email")
    }
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Colu
}