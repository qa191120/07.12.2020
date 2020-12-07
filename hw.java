package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Please enter temperature :");

        /*
        Targil:
        1. print "Please enter temperature"
        2. input from user a float number into variable called "temperature" (nextFloat)
        3. if temperature is higher than 36.5
            print "Hot"
        4. if temperature is lower than 36.5
            print "Cold"
        */
        float temperature = s.nextFloat();
        if (temperature > 36.5) {
            System.out.println("Hot");
        }
        if (temperature < 36.5) {
            System.out.println("Cold");
        }

        System.out.print("Please enter your age: ");
        int my_age = s.nextInt();

        if (my_age > 18) {
            System.out.println("Grown up");
        }

        if (my_age < 13) {
            System.out.println("Child");
        }

        System.out.print("Please enter number for a: ");
        double a = s.nextDouble();
        System.out.print("Please enter number for b: ");
        double b = s.nextDouble();

        if (a > b) {
            System.out.println("a is bigger");
            System.out.println(a);
        }

        if (b > a) {
            System.out.println("b is bigger");
            System.out.println(b);
        }

        System.out.println("Program ended...");



    }
}
