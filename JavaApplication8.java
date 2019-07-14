/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.*;

/**
 *
 * @author Jason
 */
public class JavaApplication8 {

    public static void calculate(String symbol, float num1, float num2) {
        if ("+".equals(symbol)) {
            float answer = num1 + num2;
            System.out.println(num1 + symbol + "" + num2 + "" + " = " + answer);
        } else if ("-".equals(symbol)) {
            float answer = num1 - num2;
            System.out.println(num1 + symbol + "" + num2 + "" + " = " + answer);
        } else if ("*".equals(symbol)) {
            float answer = num1 * num2;
            System.out.println(num1 + symbol + "" + num2 + "" + " = " + answer);
        } else if ("/".equals(symbol)) {
            float answer = num1 / num2;
            System.out.println(num1 + symbol + "" + num2 + "" + " = " + answer);
        } else {
            System.out.println("error");
        }//end if
    }//end calculate

    public static void main(String[] args) {
        // TODO code application logic here 
        boolean i = true;
        while (i != false) {
            System.out.println("Please enter a number ");
            Scanner scanner = new Scanner(System.in);
            float num1 = scanner.nextFloat();

            System.out.println("Please enter a second number ");

            float num2 = scanner.nextFloat();

            System.out.println("Your numbers are " + num1 + " and " + num2);

            System.out.println("Please enter the math symbol you would like to use.");

            scanner.nextLine();

            String symbol = scanner.nextLine();

            System.out.println("The symbol you have chosen is " + symbol);

            calculate(symbol, num1, num2);
            System.out.println("Do you want to calculate again?");

            String loop = scanner.nextLine();
            if ("yes".equals(loop)) {
                i = true;
            } else if ("no".equals(loop)) {
                i = false;
            }//end if
        }//end while
    }//end main

}//end class
