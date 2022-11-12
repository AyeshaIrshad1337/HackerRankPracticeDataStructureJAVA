package edu;

import java.util.Scanner;

public class HelloGoodbye {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(",");
        System.out.println("Hello "+parts[0]+" and "+parts[1]);
        System.out.println("Goodbye "+parts[1]+" and "+parts[0]);
    }
}
