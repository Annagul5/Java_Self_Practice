package javaDay07;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the radius:");

        double answer = input.nextDouble();

        double area= (answer*answer)*3.14;
        double perimeter=answer*2*3.14;

        System.out.println(" The area of the Circle is: "+area);
        System.out.println(" The perimeter of the Circle is: "+perimeter);

    }
}
