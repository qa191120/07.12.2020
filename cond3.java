package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = s.nextInt();
        // if number > 0 print positive
        // if number =< 0 print negative or zero
        /*
        //Long
        if (number > 0) {
            System.out.println("positive");
        }
        if (number <= 0) {
            System.out.println("negative or zero");
        }
        */
        if (number > 0) {
            System.out.println("positive");
        }
        //if the condition was false do this:
        else  {
            System.out.println("negative or zero");
        }

        // input float from user for temperature
        // if temperature >= 37.5 or temperature <= 36 print "goto doctor"
        //     otherwise print "no need doctor"
        System.out.println("Enter temperature:");
        float temperature = s.nextFloat();
        if (temperature >= 37.5 || temperature <= 36) {
            System.out.println("Goto doctor! hurry!");
        }
        else {
            System.out.println("No need for doctor... you ok.");
        }

        System.out.println("Enter a number:");
        int second_number = s.nextInt();
        // if second_number > 0 print positive
        // if second_number < 0 print negative
        // if second_number == 0 print zero
        //Long
        /*
        if (second_number > 0) {
            System.out.println("positive");
        }
        else {
            if (second_number < 0) {
                System.out.println("negative");
            }
            else {
                System.out.println("zero");
            }
        }
         */
        if (second_number > 0) {
            System.out.println("positive");
        }
        else if (second_number < 0) {
                System.out.println("negative");
            }
        else {
                System.out.println("zero");
            }

        // input a, b, c
        // print the biggest
        // if a is bigger than b and bigger than c --> biggest
        // else if b is bigger than c then b is biggest
        // else c is biggest

        System.out.println("Program ended...");

    }
}
