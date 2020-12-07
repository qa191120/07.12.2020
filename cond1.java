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


        System.out.println("Program ended...");



    }
}
