package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {

        input = input.toUpperCase();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        boolean all_found = true;
            
        for (int i = 0; i < alphabet.length(); i++) {
            if (input.indexOf(alphabet.substring(i,i+1)) == -1) {
                all_found = false;
                break;
            };
        }
        return all_found;
    }

}
