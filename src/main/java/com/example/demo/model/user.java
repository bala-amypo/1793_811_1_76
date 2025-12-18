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

    @Column(nullable = false)
    private String email;

    @Column (nullable = false)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "user_role",
        joinColumns = @JoinColumn (name = "user_id"),
        inverseJoincolumns = @JoinColumn(name = "role_id") 
    )
    public set<Role> = roles = new Hashset<>();

    public user(){
    }
    
    public user(String user name, String email,String passwor){
        this.username = username;
        this.email = email
        this.password
    }
}