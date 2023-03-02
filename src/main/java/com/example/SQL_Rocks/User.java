package com.example.SQL_Rocks;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  //So that hibernate can identify whose attributes to pick for table creation
@Table(name = "user_info")  //This is just for giving table name by default: tableName ==className
public class User {
    @Id //It is written on that attribute which has to become the primary key
    private int id;  //id is primary key


    private String name;

    private int age;

    //default constructor
    public User() {
    }

    //parameterized constructor
    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
