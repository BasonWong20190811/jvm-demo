package com.ban.jvm.memory.area;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class JVMMethodAreaOOM {

    public static void main(String[] args) {
        int i=0;
        while (true) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                    return proxy.invokeSuper(obj, args);
                }
            });
            Object o = enhancer.create();
            System.out.println(i);
            System.out.println(o);
            i++;
        }
    }

    static class OOMObject {

    }
}