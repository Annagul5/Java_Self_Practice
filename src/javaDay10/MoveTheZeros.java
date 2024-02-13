package javaDay10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveTheZeros {
    public static void main(String[] args) {
        /*  5.1 Given an ArrayList, move
           all zeros to the last indexes of
           the ArrayList.
         */
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.rotate(numbers, 4);
        System.out.println(numbers);
    }
}
