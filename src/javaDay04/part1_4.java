package javaDay04;

public class part1_4 {
    public static void main(String[] args) {
        //Write a program that calculates the average of Math, Chemistry,
        // and Biology scores and prints the grade table.
        //90-100->A  80-89->B 70-79->C 60-69->D 0-59->F
        
        int math = 60;
        int chemistry = 60;
        int biology = 60;
        
        int average =(math+chemistry+biology)/3;
        
        if (average>=90 && average<=100){
            System.out.println("Average is "+average);
            System.out.println("Grade is A");
        } else if (average>=80 && average<90){
            System.out.println("Average is "+average);
            System.out.println("Grade is B");
        } else if (average>=70 && average<80){
            System.out.println("Average is "+average);
            System.out.println("Grade is C");
        } else if (average>=60 && average<70){
            System.out.println("Average is "+average);
            System.out.println("Grade is D");
        } else if (average>=0 && average<60){
            System.out.println("Average is "+average);
            System.out.println("Grade is F");
        } else {
            System.out.println("İnvalid average");
        }


    }
}
