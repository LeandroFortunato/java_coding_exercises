package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {

        input = input.toUpperCase();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        boolean all_found = true;
            
        for (int each_letter = 0; each_letter < alphabet.length(); each_letter++) {
            if (input.indexOf(alphabet.substring(each_letter,each_letter+1)) == -1) {
                all_found = false;
                break;
            };
        }
        return all_found;
    }

}
