package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
       return (person.getPersoncity().equals("Manchester")) ;
    }

    public boolean canWatchFilm(Person person) {
        return (person.getPersonage() >= 18) ;
    }    
    
}
