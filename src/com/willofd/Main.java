package com.willofd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a task");

        String task = myObj.nextLine();
        System.out.println("Your new task is " + task);
    }
}