package com.example.database_service;

import org.springframework.data.annotation.Id;

public class Users {

    public Users() {
    }

    public Users(String first_name, String last_name, int age, String email_adress, String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.email_adress = email_adress;
        this.password = password;
    }

    @Id
    private Long id;

    private String first_name;

    private String last_name;

    private int age;

    private String email_adress;

    private String password;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail_adress() {
        return email_adress;
    }

    public void setEmail_adress(String email_adress) {
        this.email_adress = email_adress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}