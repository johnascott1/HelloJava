package com.week1;

import static input.InputUtils.*;

/**
 * Input and output.
 */
public class Main {
    
    public static void main(String[] args) {
        
        /* Write your code here */
        
        String name = stringInput("Please enter your name?");
        System.out.println("Hello, " + name + "!");

        int student = intInput("How many students?");
        System.out.println("There are " + student + " students in class.");

        double bookPrice = doubleInput("What is the price of this book?");
        System.out.println("The book is $" + bookPrice);

        boolean again = yesNoInput("Do you want to continue?");

        double mms = doubleInput("How many M&Ms in a packet?");
        int people = intInput("How many people would like to share?");

        double mmsEach = mms / people;

        System.out.println("Each person gets " + mmsEach + " M&Ms each.");
    }
    
}
