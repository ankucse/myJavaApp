package org.example;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The sum of two numbers is : " + (a+b));
    }
}
