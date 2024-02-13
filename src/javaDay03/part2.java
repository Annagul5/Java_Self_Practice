package javaDay03;

public class part2 {
    public static void main(String[] args) {
        int x =2;
        int y = x++;//y=2 , x=3
        System.out.println(y);
        System.out.println(x++); //x=3
        System.out.println(--x);//x=1 (3)
        x=8;
        y=x--;
        System.out.println(y);//8


        int a=10;
        a= --a + a++ + a-- + a++;
        //  9 + 10+10+10 a=39?
        System.out.println(a);//37

        int f =4;
        int g = --f * 4 - f++;
        //       f=12 g=3 - g=4 f=5
        System.out.println("f= "+f);//4
        System.out.println("g= "+g);//9




    }
}
