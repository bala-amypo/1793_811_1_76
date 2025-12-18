package com.example.demo.model;

import jakarta.persistence.*;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(
    neme = "users",
    uniqueConstraints = {
        @uniqueConstraints(columnName = "username")
    }
)