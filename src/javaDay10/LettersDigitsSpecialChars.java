package javaDay10;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {
        //1.1 Given a string, retrieve and display the letters, digits, and
        // special characters separately.

            String str ="Wooden Spoon123!";

        System.out.print("Letter:");
        for (char each : str.toCharArray()) {

            if(Character.isLetter(each)){

                System.out.print(each);
            }

        }
        System.out.println();
        System.out.print("Digit:");
        for (char each : str.toCharArray()) {

            if(Character.isDigit(each)){

                System.out.print(each);
            }

        }
        System.out.println();
        System.out.print("SpecialChar:");
        for (char each : str.toCharArray()) {

            if(!Character.isLetterOrDigit(each)){

                System.out.print(each);
            }

        }
     }
}
