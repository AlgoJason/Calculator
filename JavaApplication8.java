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

    public static void calculate(String symbol, int num1, int num2) {
        if ("+".equals(symbol)) {
            int answer = num1 + num2;
            System.out.println(num1 + symbol + "" + num2 + "" + " = " + answer);
        } else if ("-".equals(symbol)) {
            int answer = num1 - num2;
            System.out.println(num1 + symbol + "" + num2 + "" + " = " + answer);
        } else if ("*".equals(symbol)) {
            int answer = num1 * num2;
            System.out.println(num1 + symbol + "" + num2 + "" + " = " + answer);
        } else if ("/".equals(symbol)) {
            int answer = num1 / num2;
            System.out.println(num1 + symbol + "" + num2 + "" + " = " + answer);
        } else {
            System.out.println("error");
        }//end if
    }//end calculate

    public static void main(String[] args) {
        // TODO code application logic here 

        System.out.println("Please enter a number ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        System.out.println("Please enter a second number ");

        int num2 = scanner.nextInt();

        System.out.println("Your numbers are " + num1 + " and " + num2);

        System.out.println("Please enter the math symbol you would like to use.");

        scanner.nextLine();

        String symbol = scanner.nextLine();

        System.out.println("The symbol you have chosen is " + symbol);

        calculate(symbol, num1, num2);

    }//end main

}//end class
