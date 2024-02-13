package javaDay05.lab03;

public class SumEvenNum {
    public static void main(String[] args) {
        int num=0;
        int sumEven=0;
        while (num<=10){
           if (num%2==0){
               sumEven=sumEven+num;
           }
           num++;
        }
        System.out.println(sumEven);
    }





















}
