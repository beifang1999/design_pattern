package com.design.pattern.structural.proxy.cglib_static_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory<T> implements MethodInterceptor {


    private final T target;

    public ProxyFactory(T target) {
        this.target = target;

    }

    @SuppressWarnings("unchecked")
    public T getProxyObject() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);

        return (T) enhancer.create();

    }


    @Override
    public Object intercept(Object object, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {


        if ("sell".equals(method.getName())) {
            int price = (int) method.invoke(target, objects);
            System.out.println("代收点加价" + objects[0] + "元");
            return price;
        }

        return method.invoke(target, objects);
    }
}
