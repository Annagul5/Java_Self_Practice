package javaDay05.lab04;

public class GuessResult {
    public static void main(String[] args) {
        //Que 1
//        int x =3;
//        int i =0;
//        while (i<3){
//            x+=1;
//            i+=1;
//        }
//        System.out.println(x);
        System.out.println();
        System.out.println("-------------------------");
        //Que 2
//        int start = 1; //3
//        int sum=0; //1
//        do {
//            if (start%2==0){
//                start++;
//            }
//           sum +=start;
//        }while (++start<=10);
//        System.out.println(sum);
        System.out.println();
        System.out.println("-------------------------");
        //Que 4
//        int x =20;
//        while (x>0){
//            do {
//                x-=2;
//            }while (x>5);
//        }
//        x--;
//        System.out.println(x);
//

        int c =0;
        boolean flag=true;
        for (int i = 0; i < 8; i++) {
            while (flag){
                c++;
                if (i>c||c>3){
                    flag=false;
                }
            }
        }
        System.out.println(c);


    }
























}
