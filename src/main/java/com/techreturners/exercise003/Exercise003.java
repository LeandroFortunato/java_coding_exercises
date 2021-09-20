package com.techreturners.exercise003;

import javax.print.FlavorException;

public class Exercise003 {
    private String flavor[] = {"Pistachio","Raspberry Ripple","Vanilla","Mint Chocolate Chip","Chocolate","Mango Sorbet"};

    public int getIceCreamCode(String iceCreamFlavour) {
         for (int each_flavor = 0; each_flavor < 6; each_flavor++) {
             if (flavor[each_flavor] == iceCreamFlavour) {
                return each_flavor;
             }
         }
         return -1;
    }
}
