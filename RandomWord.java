package edu;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        String value = "unchanged";
        String temp = "";
        double i = 1.0;
        while (!StdIn.isEmpty()) {
            temp = StdIn.readString();

            if (StdRandom.bernoulli(1.0 / i)) {
                value = temp;

            }
            i++;
            System.out.println(i);

        }if(value=="unchanged")
        System.out.println(temp);
        else{
            System.out.println(value);
        }
    }
}