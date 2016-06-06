package com.company;

public class Main {

    public static void main(String[] args) {
        //This is a comment! The computer won't read this line!

	    //Variables!
        int a = 2; //these are integers. They can be any whole number.
        int b = 3;

        double e = 5.5;// These are doubles. Think of doubles as decimal numbers.
        double f = 3.1;

        //Lets do some Math!
        int c = a+b; //Addition: c is 5
        int d = a*b; //Multiply: d is 6

        double g = e-f; //Subtract: g is 2.4
        double h = e/f; //Division: h is 1.77419

        //NOTE: if division of two int's gives a decimal, we round down! DOWN!
        //PRO TIP: try not to mix double and int variables/numbers together. You can do it but it gets tricky.

        //Output to console!
        System.out.println("Hello World!");

        //We can print our variables we worked so hard on!
        System.out.println(a);
        System.out.println(d);
        System.out.println(h);

        //Combine text and variables!
        System.out.println("The value of b is: " + b);
        System.out.println("The value of g is: " + g + "!");

        //Strings are defined by anything inside double quotes "".
        String sampleString = "I am a sample string!";
        System.out.println(sampleString);

        //Strings are cool because can perform actions on them. We'll refer to these actions as methods.
        System.out.println(sampleString.length()); // a method call is performed by putting a "."  followed by the method name.
        System.out.println(sampleString.charAt(3)); //grabs the 4th character in the string (strings are 0 indexed).

        //Loops
        for (int index = 0; index < 5; index = index + 1){
            System.out.println(index);
        }

        /*Have them write a loop that prints each character of a string;
        should look like this: */
//        for (int i = 0; i < sampleString.length(); i++){
//            System.out.println(sampleString.charAt(i));
//        }
    }
}
