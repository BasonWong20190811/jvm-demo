package com.ban.jvm.engine;

/**
 * @author wangban
 */
public class DynamicDispatch {

    static abstract class Human{
        protected abstract void say();
    }
    static class Man extends Human{

        @Override
        protected void say() {
            System.out.println("man say hello");
        }
    }
    static class Woman extends Human{

        @Override
        protected void say() {
            System.out.println("Woman say hello");
        }
    }
    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        man.say();
        woman.say();
        man = new Woman();
        man.say();
    }


}
