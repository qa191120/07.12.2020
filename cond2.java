package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a grade (0-100):");
        int grade = s.nextInt();
        /*
        Long
        if (grade < 0) {
            System.out.println("grade not in range 0-100");
        }
        if (grade > 100) {
            System.out.println("grade not in range 0-100");
        }
         */
        // Short
        if (grade < 0 || grade > 100) { // 'or' in java is ---> || [pipes]
            System.out.println("grade not in range 0-100");
        }

        // input 2 int numbers a,b.
        // if both are negative print "cannot have 2 negatives!"
        // hint: if inside if
        System.out.println("Please enter a");
        int a = s.nextInt();
        System.out.println("Please enter b");
        int b = s.nextInt();
        if (a < 0 && b < 0) { // 'and' in java is ---> &&
            System.out.println("Both a and b are negatives");
        }
        /*
        // long
        if (a < 0) {
            if (b < 0) {
                System.out.println("Both a and b are negatives");
            }
        }
        */
        
        // targil:
        // 1. input a,b,c (int)
        //    check if c is the biggest number
        //    ... if so print "c is the biggest"
        //        use 1 condition with 2 'and'
        // 2. input d,e,f (int)
        //    check if d is the smallest number
        //    ... if so print "d is the biggest"
        //        use 1 condition with 2 'or' 
        
        System.out.println("Program ended...");



    }
}
