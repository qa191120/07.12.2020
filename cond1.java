package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = s.nextInt();

        if (number == 0) {
            System.out.println("You entered zero!");
        }
        // ! -- reverse
        if (number != 0) { // 1.
            System.out.println("You entered a number which is NOT zero!");
        }
        //if (!(number == 0)) { // 2. ! -- reverse --> here overcomplicated
            //System.out.println("You entered zero!");
        //}

        // input 2 int numbers from user (a,b)
        // if a anb b are equal: print "a equals b"
        // if a anb b are NOT equal: print "a NOT equals b"
        // 1*etgar: (a and b should have the max value)
        // a=3,b=8 --> result: a=8, b=8
        // a=9,b=1 --> result: a=9, b=9
        // ... Max
        // 2***etgar: switch between a and b (hint: use c)
        System.out.println("Program ended...");



    }
}
