package com.willofd;

public class Main {
    public static void main(String[] args) {
        byte age = 30; // can save up to 127
        int viewsCount = 3_123_456; // can separate numbers with underscore for readability
        long readsCount = 1_234_567_8901L; // if it's a big number, add L or l, preferably L for readability
        String name = "Jane";
        System.out.println(name + " is " + age);
    }
}