package com.ban.jvm.load;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NotInitialzation {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("452.22");
        BigDecimal b2 = new BigDecimal("0.3");
        BigDecimal b3 = new BigDecimal("0.3");
        BigDecimal b4 = new BigDecimal("0.4");
        System.out.println(b1.multiply(b2).setScale(2, RoundingMode.HALF_UP));
        System.out.println(b1.multiply(b3).setScale(2,RoundingMode.HALF_UP));
        System.out.println(b1.multiply(b4).setScale(2,RoundingMode.HALF_UP));
    }
}
