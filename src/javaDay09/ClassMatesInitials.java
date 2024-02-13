package javaDay09;

import java.util.Arrays;

public class ClassMatesInitials {
    public static void main(String[] args) {
        String[] classmates = {"Olivia Bennett", "Emma Foster", "Liam Parker",
                "Ethan Sullivan", "Isabella Rodriguez",
                "Mason Turner", "Ava Mitchell", "" +
                "John Doe", "Alice Smith", "Robert Johson"};
        String[] initials = findInitials(classmates);
        System.out.println(Arrays.toString(initials));
    }
    public static String[] findInitials(String[] classmates){
        String[] initials = new String[classmates.length];
        for (int i = 0; i < classmates.length; i++) {

            initials[i]= classmates[i].charAt(0)+ "."+ classmates[i].charAt( classmates[i].indexOf(" ")+1);
        }
        return  initials;
    }
}
