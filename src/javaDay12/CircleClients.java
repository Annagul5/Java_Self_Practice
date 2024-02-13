package javaDay12;

public class CircleClients {
    public static void main(String[] args) {

        Circle circle = new Circle(-3);


        System.out.println(circle.getRadius());
        System.out.println(circle.calcArea());
        System.out.println(circle.calcPerimeter());
    }
}
