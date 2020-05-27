package com.ban.jvm.init;

public class Test {
    static class Parent{
        public static int a=1;
        static{
            a=2;
        }
        public Parent(){
            a = 3;
        }

    }
    static class Sub extends Parent{
        public static int b=a;
    }

    public static void main(String[] args) {
        System.out.println(Sub.b);
    }

}
