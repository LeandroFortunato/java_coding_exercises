package com.techreturners.exercise003;

import javax.print.FlavorException;

public class Exercise003 {
    private String flavor[] = {"Pistachio","Raspberry Ripple","Vanilla","Mint Chocolate Chip","Chocolate","Mango Sorbet"};

    public int getIceCreamCode(String iceCreamFlavour) {
         for (int i = 0; i < 6; i++) {
             if (flavor[i] == iceCreamFlavour) {
                return i;
             }
         }
         return -1;
    }
}
