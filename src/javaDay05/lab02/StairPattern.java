package javaDay05.lab02;

public class StairPattern {
    public static void main(String[] args) {
        for (int row = 1; row <=6 ; row++) {
            for (int column = 1; column <row ; column++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
    }
}
