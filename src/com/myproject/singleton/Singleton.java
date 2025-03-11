package com.myproject.singleton;

class Singleton {
    // Step 2: Create a private static instance
    private static Singleton instance;

    // Step 1: Private constructor to restrict object creation
    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    // Step 3: Public static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) { // Create instance if not already created
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

