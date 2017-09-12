package com.week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import static input.InputUtils.*;

/**
 * Input and output.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        myList.add("hello");
        myList.add("java");
        myList.add(2545);
        myList.add("Tuesday");
        myList.add("python");
         myList.add(2, "C#");
        myList.add(0, "Ruby");

        for (Object ob : myList) {
            System.out.println(ob);

        }
        firstLinkList();
        //moreArrays();
        ArrayList mySecondList = new ArrayList();
        mySecondList.add("Java Programming");
        mySecondList.add("SQL Server");
        mySecondList.remove(0);
    }
    public static void moreArrays(){
        ArrayList<Double> prices = new ArrayList<>();
        while (yesNoInput("Any more books?")) {
            double price = doubleInput("Enter price:");

            prices.add(price);
        }
        System.out.println(prices);
        System.out.println();
    }
    public static void firstLinkList() {
        String hello = "hello";
        String helloExclamation = "hello!";
        String helloCapitalH = "Hello";

        System.out.println(hello.hashCode());
        System.out.println(helloExclamation.hashCode());
        System.out.println(helloCapitalH.hashCode());

        HashMap<String, Integer> snowfall = new HashMap<>();
        snowfall.put("January", 10); snowfall.put("February", 3);
        snowfall.put("March", 3); snowfall.put("April", 0);

        String newMonth = stringInput("Enter month");
        int newSnow = positiveIntInput("Enter snow for " + newMonth);

        if (snowfall.containsKey(newMonth)) {
            boolean overwrite = yesNoInput("Do you want to overwrite " + newMonth
            + ". The current value is " + snowfall.get(newMonth));
            if (overwrite) {
                snowfall.put(newMonth, newSnow);
            }
            else {
                System.out.println("Data was not added. Old data preserved.");
            }
            int total = 0;
            for (String month : snowfall.keySet()) {
                int snow = snowfall.get(month);
                System.out.println(month + " snowfall = " + snow);
                total += snow;
            }
            System.out.println("Total is " + total);
        }

    }


}