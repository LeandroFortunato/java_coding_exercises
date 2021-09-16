package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return word.substring(0,1).toUpperCase()+word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return firstName.charAt(0)+"."+ lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        double roundDbl = Math.round(originalPrice*(1+(vatRate/100))*100.0)/100.0;
        return roundDbl;
    }

    public String reverse(String sentence) {
        StringBuilder stbuilder = new StringBuilder(sentence);
        stbuilder.reverse();
        return stbuilder.toString();
    }

    public int countLinuxUsers(List<User> users) {
        System.out.println("-----**********-------HERE----------------------");
        int n_linux_users = 0;
        for (User i : users) {
            if (i.getType() == "Linux") {
                n_linux_users +=1;
            }
        }
        return n_linux_users;
    }
}
