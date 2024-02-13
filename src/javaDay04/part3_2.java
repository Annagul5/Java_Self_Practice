package javaDay04;
//traffic lights color
public class part3_2 {
    public static void main(String[] args) {
        char color='r';
        switch (color){
            case 'r','R':
                System.out.println("Red");
                break;
            case 'Y','y':
                System.out.println("Yellow");
                break;
            case 'g','G':
                System.out.println("Green");
                break;
        }
    }
}
