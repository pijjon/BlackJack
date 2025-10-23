package com.pluralsight;

import java.util.Scanner;

public class BlackJack {
    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

    }
    public int askUserInt(String question) {
        System.out.println(question);
        int output = myScanner.nextInt();
        myScanner.nextLine();
        return output;
    }
}
