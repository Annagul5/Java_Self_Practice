package javaDay03;

public class part3 {
    public static void main(String[] args) {
        int b = 2;
        boolean result=(++b ==2 ||b==2) && --b ==2;
          //           3==2=false false
        //                     false && ... = false
        System.out.println(result);
        System.out.println(b);//3
    }
}
