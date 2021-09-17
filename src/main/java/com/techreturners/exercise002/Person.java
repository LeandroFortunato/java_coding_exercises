package com.techreturners.exercise002;

public class Person {
    private String firstname;
    private String lastname;
    private String city;
    private int    age;

    public Person(String firstname, String lastname, String city, int age) {
        this.firstname = firstname;
        this.lastname  =  lastname;
        this.city      =  city;
        this.age       =  age;
    }

    public String getPersonfirstname() {
        return firstname;
    }
    public String getPersonlastname() {
        return lastname;
    }       
    public String getPersoncity() {
        return city;
    }   
    public int getPersonage() { 
        return age;
    }                    
}