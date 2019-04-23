package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Declare variables
        Scanner input = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();
        String newColor;
        String answer;

        //Add 3 colors to the array list and print out its values
        colors.add("red");
        colors.add("yellow");
        colors.add("purple");

        for (String m : colors) {
            System.out.println(m);
        }

        //Prompt user for one new color and add that color to arrayList


        do {
            System.out.println("\nPlease enter a new color: ");
            newColor = input.nextLine();

            colors.add(newColor);

            System.out.println("\nContinue? Enter Q if you'd like to exit!");
            answer = input.nextLine();


        }while(!answer.equalsIgnoreCase("Q"));

        //Print final list
        for (String m : colors) {
            System.out.println(m);
        }
    }
}
