package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("Goodbye");
        //double x = Math.random(); // random number [0,1)
        //double x = Math.random()*10; // random double [0.0,10.0)
        //int x = (int)(Math.random()*10 + 10); // random int [10,20)
        //int x = (int)(Math.random()*6+1);
        //int y = (int)(Math.random()*6+1);
        //(int)(Math.random() *a+b) // a numbers starting at b
        int a = (int)(Math.random()*11); // Random integer between 0 and 10
        int b = (int)(Math.random()*6+1); // Simulate a die (1-6)
        int c = (int)(Math.random()*2); // Simulate a coin flip (0-1)
        int d = (int) ((int)(Math.random()*6+1)+(Math.random()*6+1)); // Simulate rolling a pair of dice.
        int e = (int)(Math.random()*36+65); // Simulate a passing grade, a random integer between 65 and 100
        double f = Math.random()*10+1; // A random decimal between 1 and 10.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
