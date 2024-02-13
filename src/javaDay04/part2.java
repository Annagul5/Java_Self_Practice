package javaDay04;

public class part2 {
    public static void main(String[] args) {
        //greatest with nesnetive statment
        int num1=-7;
        int num2=-7;
        if(num1>num2){
            if(num1<0){
                System.out.println("num1 is negative");
            } else if (num1>0) {
                System.out.println("num1 is positive");
            }else{
                System.out.println("num1 is zero");
            }
        } else if (num1<num2) {
            if(num2<0){
                System.out.println("num2 is negative");
            } else if (num2>0) {
                System.out.println("num2 is positive");
            }else{
                System.out.println("num2 is zero");
            }
        }else {
            System.out.println("numbers are equal");
        }
    }
}
