package com.ban.jvm.memory.gc;

public class ReferenceCountingGC {
    public Object instance = null;
    private static final int _1MB = 1024*1024;
    private byte[] bigSize = new byte[2*_1MB];

    public static void testGC(){
        ReferenceCountingGC ra = new ReferenceCountingGC();
        ReferenceCountingGC rb = new ReferenceCountingGC();
        ra.instance = rb;
        rb.instance = ra;
        ra=null;
        rb=null;
        System.gc();
    }


    public static void main(String[] args) {
        testGC();
    }
}
