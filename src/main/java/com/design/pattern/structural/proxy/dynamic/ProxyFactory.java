package com.design.pattern.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    @SuppressWarnings("unchecked")
    public static <T> T getProxyObject(T target) {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new Handler<>(target));
    }

    private static class Handler<T> implements InvocationHandler {
        private final T target;

        public Handler(T target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            String name = method.getName();

            if ("sell".equals(name)) {
                System.out.println("代售点加价2元！");

                return (int) method.invoke(target, args) + 2;
            }

            return method.invoke(target, args);
        }
    }
}
