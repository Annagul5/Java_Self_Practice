package javaDay05.lab02;

public class NumberPattern {
    public static void main(String[] args) {
        for (int row = 1; row <=5; row++) {
            for (int column = 1; column <=row ; column++) {
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
}
