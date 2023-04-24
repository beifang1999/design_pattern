package com.design.pattern.build.factory.expend;

import com.design.pattern.build.factory.simple.Coffee;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public class CoffeeFactory {
    private static final Map<String, Coffee> COFFEE_CACHE = new HashMap<>();
    private static final Properties PROPERTIES = new Properties();

    static {
        //todo: try-with-resources 在try的括号里面申明对象(实现了 AutoCloseable 或 Closeable 接口) 则不需要关闭流
        // java 会自动关闭 java1.7+
        try (InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties")) {
            if (is != null) {
                PROPERTIES.load(is);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Coffee createCoffee(String name) throws Exception {
        Coffee coffee = COFFEE_CACHE.get(name);
        if (coffee == null) {
            String className = PROPERTIES.getProperty(name);
            if (Objects.nonNull(className)) {
                Class<? extends Coffee> clazz = Class.forName(className).asSubclass(Coffee.class);
                coffee = clazz.getDeclaredConstructor().newInstance();
                COFFEE_CACHE.put(name, coffee);
            }
        }
        return coffee;
    }
}
