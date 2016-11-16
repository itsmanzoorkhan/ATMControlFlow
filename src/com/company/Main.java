package com.company;
import java.util.Scanner;


public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Input input = new Input();


    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to MB Corp. ATM");

        input.chooseName();

        input.choosePrompt();


    }
}
