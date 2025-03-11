package com.myproject.singleton;


public class Main {
    public static void main(String[] args) {
        // Getting the single instance of Singleton class
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        // Checking if obj1 and obj2 are the same instance
        System.out.println(obj1 == obj2); // true (Both references point to the same object)
    }
}
