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

    public Role(string name){
        this.name = name;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public viod setName(String name){
        this.name = name;
    }
    
}