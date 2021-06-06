/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

    //Exercise 1 - Saying Hello


package org.example;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {


        //Create a program that prompts for your name and prints a greeting using your name

        //Get name from user and create string of Name from user
        Scanner getName = new Scanner(System.in);
        System.out.print("What is your name? ");
        String Name = getName.nextLine();

        //Print out Name
        System.out.print("Hello, " + Name + ", nice to meet you!");
    }
}
