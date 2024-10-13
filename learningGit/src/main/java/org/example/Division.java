package org.example;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b");

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("The division of two numbers is : " + (a/b));
    }
}
