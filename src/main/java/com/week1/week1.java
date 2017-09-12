package com.week1;

/*
 * Created by ye4697go on 8/22/2017.
 */

import static input.InputUtils.*;

import java.util.ArrayList;
public class week1 {

    public static void main(String[] args) {
        String productName = stringInput("What is the name of the product?");
        double price = doubleInput("What does " + productName + " cost?");
        int quantity = intInput("How many " + productName + " to sell?");

        // Calculate the total price
        double totalPrice = price * quantity;
        System.out.println(quantity + " of " + productName + " at $" + price + " each costs $" + totalPrice);
    }

}
