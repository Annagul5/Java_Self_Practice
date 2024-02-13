package javaDay03;

public class LeapYear {
    public static void main(String[] args) {
        int year =2020;
        boolean isLeapYear = (year%4==0&&year%100!=0)|| (year % 400==0);
        System.out.println("is " +year + "a leap year? "+ isLeapYear);
    }
}
