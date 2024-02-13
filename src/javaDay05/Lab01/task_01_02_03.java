package javaDay05.Lab01;

public class task_01_02_03 {
    public static void main(String[] args) {
        for (int i = 2; i <11 ; i+=2) {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("--------------------------------");
        System.out.print(1);
        for (int i = 3; i <20 ; i+=2) {
            System.out.print("-"+i);
        }
        System.out.println();
        System.out.println("--------------------------------");

        int sumEven =0;
        int sumOdd =0;
        for (int i = 0; i < 10; i+=2) {
            sumEven+=i;
        }

        for (int i = 1; i < 10; i+=2) {
            sumOdd+=-i;
        }
        System.out.println("sum of even number="+sumEven);
        System.out.println("sum of odd number="+sumOdd);






    }
}
