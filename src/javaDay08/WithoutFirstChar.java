package javaDay08;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String firstWord = input.next();
        System.out.println("Enter second word: ");
        String secondWord = input.next();
        input.close();

        String firstLetter = firstWord.substring(1);

        firstWord = firstLetter;


        String scondLetter = secondWord.substring(1);

        secondWord = scondLetter;



        System.out.println(firstWord + secondWord);



    }
}
/*2. Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana
*/