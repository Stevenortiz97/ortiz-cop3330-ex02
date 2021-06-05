package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2
 *  Copyright 2021 Steven Ortiz
 */

//What is the input string? Homer
//Homer has 5 characters.


public class App {
    static Scanner in = new Scanner(System.in);



    public static void main(String[] args) {

        String name = readName();

        String outputString = generateOutputString(name);

        printOutput(outputString);

    }


    private static void printOutput(String outputString){
        System.out.println(outputString);
    }

    private static String readName(){
        System.out.print("What is the input string?");
        String name = in.nextLine();
        return name;
    }

    private static String generateOutputString(String name) {

        return name + " has " + name.length() + ", characters.";
    }
}
