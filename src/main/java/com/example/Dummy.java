package com.example;

public class Dummy {
    public void badMethod() {
        if (true)
            System.out.println("This is a bad practice"); // Noncompliant
        int a = 1 / 0; // Noncompliant
    }
}
}}
