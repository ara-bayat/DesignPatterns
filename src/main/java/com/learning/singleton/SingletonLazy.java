package com.learning.singleton;

public class SingletonLazy {

    private SingletonLazy() {
        // جلوگیری از ایجاد نمونه با Reflection
    }

    private static class SingletonHelper {
        private static final SingletonLazy INSTANCE = new SingletonLazy();
    }

    public static SingletonLazy getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton! Name: " + name);
    }
}
