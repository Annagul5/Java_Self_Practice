package javaDay08;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String answer = input.next();
        input.close();
            if (answer.contains("x")){
                answer=answer.replaceFirst("x","a");
        }

        System.out.println(answer);
    }
}
/*1. Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex
*/
