package javaDay10;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {


    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

    numbers.add(1);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

        System.out.println(numbers);
    }
}
