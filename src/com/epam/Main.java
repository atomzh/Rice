package com.epam;

import java.math.BigDecimal;


public class Main {

    public static void main(String[] args) {
        BigDecimal two = new BigDecimal(2);
        BigDecimal total = new BigDecimal(0);
        for (int i = 1; i <= 64; i++) {
            BigDecimal rice = new BigDecimal(2);
            for (int j = 2; j <= i; j++) {
                rice=rice.multiply(two);
            }
            total=total.add(rice);
            System.out.println(i+")"+total);
        }
        System.out.println(total);
    }
}
