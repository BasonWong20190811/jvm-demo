package com.ban.jvm.memory.area;

public class RunTImeConstantPoolOOM {
    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern()==str1);
        String str11 = "计算机软件";
        System.out.println(str1==str11);
        String str112 = new StringBuilder("计算机").append("软件").toString();

        System.out.println(str112.intern()==str1);

        String str2 = new StringBuilder("mai").append("n").toString();
        System.out.println(str2.intern()==str2);

    }
}
