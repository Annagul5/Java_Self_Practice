package javaDay04;
//laptop model
public class part3_1 {
    public static void main(String[] args) {
        String model="apple";

        switch (model){
            case "apple":
                System.out.println("Apple-no virus");
                break;
            case "dell":
                System.out.println("Tough one");
                break;
            case "hp":
                System.out.println("Not recommended");
                break;
            default:
                System.out.println("Do not buy that one");

        }

    }
}
