/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Julio Lopez
 */
package org.example;
import java.text.DecimalFormat;
import java.time.Year;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Enter the price of item 1: " );
        Scanner s = new Scanner(System.in);
        String p1 = s.nextLine();
        System.out.println("Enter the quantity of item 1: ");
        String q1 = s.nextLine();
        System.out.println( "Enter the price of item 2: " );
        String p2 = s.nextLine();
        System.out.println("Enter the quantity of item 2: ");
        String q2 = s.nextLine();
        System.out.println( "Enter the price of item 3: " );
        String p3 = s.nextLine();
        System.out.println("Enter the quantity of item 3: ");
        String q3 = s.nextLine();
        Double price1 = Double.valueOf(p1);
        Double quan1 = Double.valueOf(q1);
        Double price2 = Double.valueOf(p2);
        Double quan2 = Double.valueOf(q2);
        Double price3 = Double.valueOf(p3);
        Double quan3 = Double.valueOf(q3);
        DecimalFormat f = new DecimalFormat("##.00");
        Double subtotal = (price1 * quan1) + (price2 * quan2) + (price3 * quan3);
        Double tax = subtotal * .055;
        Double total = subtotal + tax;
        System.out.println("Subtotal: $" + f.format(subtotal));
        System.out.println("Tax: $" + f.format(tax));
        System.out.println("Total: $" + f.format(total));



    }
}
