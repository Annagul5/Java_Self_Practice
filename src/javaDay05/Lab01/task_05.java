package javaDay05.Lab01;

public class task_05 {
    public static void main(String[] args) {
        int kph=0;
        double mph=0.0;
        System.out.print("khp\t|\tmph");
        System.out.println("-----------");
        for (int i = 20; i <= 140; i+=10) {
            kph=i;
            mph=kph*0.62;
            System.out.println(kph+"\t|\t"+mph);
        }
    }
}
