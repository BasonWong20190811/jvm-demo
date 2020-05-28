package com.ban.jvm.engine;

public class StaticDispatch {
    static abstract class Human{

    }
    static class Man extends Human{

    }
    static class Woman extends Human{

    }
    public void say(Human man){
        System.out.println("Human");
    }
    public void say(Man man){
        System.out.println("man");
    }
    public void say(Woman man){
        System.out.println("Woman");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        StaticDispatch sd = new StaticDispatch();
        sd.say(man);
        sd.say(woman);
    }
}
