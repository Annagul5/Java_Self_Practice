package javaDay07;

import java.util.Scanner;

public class FamilyMembers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" How many people do you live with?");
        int answer = input.nextInt();
        if (answer<3){
            System.out.println("Live with less than three people.");
        } else if (answer==3 || answer==6) {
            System.out.println("Live with 3 - 6 people.");
        } else if (answer>6) {
            System.out.println("Live with more than six people.");
        }else{
            System.out.println("Invalid number");
        }
        input.close();
    }
}
