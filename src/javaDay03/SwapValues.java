package javaDay03;

public class SwapValues {
    public static void main(String[] args) {
        //write a code to swap the values of int variables
//        int num1=10;
//        int num2=7;
//
//        int temp;
//
//        temp=num1;
//        num1=num2;
//        num2=temp;
//
//        System.out.println("num1= " +num1);
//        System.out.println("num2= " +num2);
//
        //by using arithmetic operators
        int num1 = 10;
        int num2=7;
        num2= num2+num1;
        num1=num2-num1;
        num2=num2-num1;

        System.out.println("num1= "+ num1);
        System.out.println("num2= "+ num2);








    }
}
