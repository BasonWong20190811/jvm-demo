package com.ban.jvm.memory.area;

public class JVMStackSOF {
    private int stackLength=1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }
    public static void main(String[] args) throws Throwable {
        JVMStackSOF stackSOF = new JVMStackSOF();
        try {
            stackSOF.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length :"+stackSOF.stackLength);
            throw e;
        }

    }
}
