package com.codersbay;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int luckyNumber = 13;

        System.out.println("My lucky number is " + luckyNumber);
        System.out.println("Enter a number:");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number == luckyNumber) {
            System.out.println(number + " is my lucky number.");
        }

        if (number % 10 == 0) {
            System.out.println(number + " is a round number.");
        }

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        if (number > 9 && number < 100) {
            System.out.println(number + " has two digits.");
        }

        if (number < -9 && number > -100) {
            System.out.println(number + " has two digits.");
        }

    }
}
