package org.practice;
import java.util.Scanner;

public class Saying_Hello {
    public static void main(String[] args) {
        // lets get a name
        Scanner getName = new Scanner(System.in);
        System.out.println("What is your name? ");
        String Name = getName.nextLine();

        // putting the output string together
        String conCat = "Hello, "+ Name+", nice to meet you!";

        // outputting separately as requested
        System.out.println(conCat);
    }
}
