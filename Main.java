package com.company; //You can ignore this. Your IDE (Eclipse) might not require it.

public class Main {
    
    public static void main(String[] args) {
        //This is a comment! The computer won't read this line!
        
        //Variables!
        int a = 1; //these are integers. They can be any whole number.
        int b = 3;
        
        //we can change the value of these variables too!
        a = 2; //We don't have to put "int" at the beginning because the computer already knows what type of variable a is.
        
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
        System.out.println(h);
        
        //Combine text and variables!
        System.out.println("The value of b is: " + b);
        System.out.println("The value of g is: " + g + "!");
        
        //Strings are defined by anything inside double quotes "".
        String sampleString = "I am a sample string!";
        System.out.println(sampleString);
        
        //Strings are cool because can perform actions on them. We'll refer to these actions as "methods".
        int length = sampleString.length(); // a method call is performed by putting a "."  followed by the method name.
        char charAtIndexThree = sampleString.charAt(3); //grabs the 4th character in the string (strings are 0 indexed).
        
        System.out.println("Length: " + length + " character at index 3: " + charAtIndexThree);
        
        /* Conditional Operators (comparing two things)
         == equal to (Note 2 equals signs here).
         < less than.
         <= less than or equal to.
         > greater than.
         >= greater than or equal to.
         != not equal to.
         */
        
        //Conditional statements
        if (a == b){
            System.out.println("A and B are equal");
        }else{
            System.out.println("A and B are NOT equal");
        }
        
        //TODO: Assuming you don't know the value of a or b, use an "if" statment to print the larger of the values.
        
        //FUNctions!
        //Functions are blocks of code that completes a specific task.
        //they are usefull so you don't have to write the same code over, and over, and over again!
        int sum = add(5, 6);
        System.out.println("Sum of 5 and 6 is: " + sum);
        
        //TODO: write a function that returns the max of two numbers. (HINT: look at the if statement you wrote to find if a or b was greater)!.
        
        //Loops
        for (int index = 0; index < 5; index = index + 1){
            System.out.println(index);
        }
        
        //TODO: write a loop that prints each character of a string;
        
        //ArrayLists
        //Arrays are basiclly lists of many different values.
        ArrayList aListVar = new ArrayList();
        //You can add, remove, get, and find the size of array lists.
        aListVar.add(1);
        aListVar.add(5);
        aListVar.add(9);
        System.out.println(aListVar) //should look like [1, 5, 9]
        
        aListVar.size() //Should be 3
        aListVar.get(1) //Will get the value 5 because it is at the 1st index (remember we start counting at 0!)
        aListVar.remove(1)//Will remove the value 5. Now aListVar should look like: [1, 9]
        
        
    }
    
    public static int add(int first, int second){
        //first is 5!
        //second is 6!
        return first + second;
    }
    
    
}
