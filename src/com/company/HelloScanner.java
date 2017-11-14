package com.company;

import java.util.Scanner;

public class HelloScanner{

    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);
        String name;
        System.out.println("Hi! Please type your name and press Enter ");
        name = scan.nextLine();
        System.out.println("Hello " + name + "! " + "Nice to meet you. ");

    }
}
