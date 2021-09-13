/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Vuolo
 */

package edu.ucf;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // prompt for noun
        System.out.print("Enter a noun: ");

        // create new scanner
        Scanner input = new Scanner(System.in);

        // read noun
        String noun = input.nextLine();

        // prompt for verb
        System.out.print("Enter a verb: ");

        // read verb
        String verb = input.nextLine();

        // prompt for adjective
        System.out.print("Enter an adjective: ");

        // read adjective
        String adjective = input.nextLine();

        // prompt for adverb
        System.out.print("Enter an adverb: ");

        // read adverb
        String adverb = input.nextLine();

        // output madlib
        System.out.print("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}
