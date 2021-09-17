package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
       if (person.getPersoncity() == "Manchester") {
           return true;
            }
       return false;
    }

    public boolean canWatchFilm(Person person) {
        if (person.getPersonage() >= 18) {
            return true;
             }
        return false;
    }
    
}
