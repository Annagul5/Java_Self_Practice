package javaDay10;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};
        list.addAll(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));

        System.out.println(list);

    }
}
