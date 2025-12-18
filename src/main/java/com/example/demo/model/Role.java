package com.exmple.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @column(nullable = false,unique = true)
    private String name;
    
    public Role(){
    }
    
}