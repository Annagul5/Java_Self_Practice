package javaDay08;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String firstWord = input.next();
        System.out.println("Enter second word: ");
        String secondWord = input.next();
        input.close();

        StringBuilder stringBuilder = new StringBuilder(firstWord);
        stringBuilder.append(secondWord);

        System.out.println(stringBuilder);




    }

}
/*3. Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight
*/
