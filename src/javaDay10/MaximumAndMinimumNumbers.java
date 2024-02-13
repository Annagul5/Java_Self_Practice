package javaDay10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumAndMinimumNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(numbers);


        int max = Collections.max(numbers);
        System.out.println("Maximum number is " + max);

        int min = Collections.min(numbers);
        System.out.println(" Minimum number " + min);



    }
}
