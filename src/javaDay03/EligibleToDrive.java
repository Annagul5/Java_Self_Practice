package javaDay03;

public class EligibleToDrive {
    public static void main(String[] args) {
        int age = 17;
        boolean hasLearningPermit=true;
        boolean hasDriverLicense=false;
       boolean result= (age >= 18 && hasDriverLicense)||(age>=15 && hasLearningPermit);
        System.out.println(result);
    }
}
