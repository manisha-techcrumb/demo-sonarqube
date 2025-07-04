package com.example;

import java.util.*;

public class dummy {

    public static void main(String[] args) {
        new dummy().unusedMethod();

        String password = "123456"; // hardcoded password (security hotspot)
        System.out.println("Password is: " + password);

        int x = 42; // unused variable
        if (true) {
            if (true) {
                if (true) {
                    if (true) {
                        System.out.println("Nested too deep!");
                    }
                }
            }
        }

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // inefficient, could use for-each
        }

        System.out.println("Password is: " + password); // duplicate code
    }

    public void unusedMethod() {
        int badIndentation=1;System.out.println("This line has poor formatting");
    }

    public void deadMethod() {
        // dead code
    }
}
-Dsonar.qualitygate.wait=true
