package com.aiexam.demo.Users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Users {
@Id
@GeneratedValue
public int id;
@Column
public String username;
@Column
public String password;
    
}
